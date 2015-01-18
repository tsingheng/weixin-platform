package net.shangtech.weixin.platform.controller;

import javax.validation.Valid;

import net.shangtech.framework.controller.AjaxResponse;
import net.shangtech.weixin.member.entity.OpenAccount;
import net.shangtech.weixin.member.entity.PlatformMember;
import net.shangtech.weixin.member.service.IOpenAccountService;
import net.shangtech.weixin.platform.vo.profile.EditOpenAccountVo;
import net.shangtech.weixin.platform.vo.profile.NewOpenAccountVo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/profile")
public class UserProfileController {
	
	@Autowired private IOpenAccountService accountService;
	
	@RequestMapping({"", "/"})
	public String main(PlatformMember member, Model model){
		
		return "platform.profile.main";
	}
	
	@RequestMapping("/new-account")
	public String newAccount(){
		return "platform.profile.account.form";
	}
	
	@ResponseBody
	@RequestMapping("/new-account/save")
	public AjaxResponse saveAccount(PlatformMember member, @Valid NewOpenAccountVo vo, BindingResult result){
		AjaxResponse ajaxResponse = AjaxResponse.instance();
		OpenAccount account = new OpenAccount();
		BeanUtils.copyProperties(vo, account);
		accountService.save(account);
		ajaxResponse.setSuccess(true);
		return ajaxResponse;
	}
	
	@RequestMapping("/edit-account/account-{id}")
	public String editAccount(PlatformMember member, Model model, @PathVariable Long id){
		return "platform.profile.account.form";
	}
	
	@ResponseBody
	@RequestMapping("/edit-account/save")
	public AjaxResponse updateAccount(PlatformMember member, @Valid EditOpenAccountVo vo, BindingResult result){
		AjaxResponse ajaxResponse = AjaxResponse.instance();
		OpenAccount account = new OpenAccount();
		BeanUtils.copyProperties(vo, account);
		accountService.update(account);
		ajaxResponse.setSuccess(true);
		return ajaxResponse;
	}
	
	@ModelAttribute
	public void menu(Model model){
		model.addAttribute("menu", "profile");
	}
}
