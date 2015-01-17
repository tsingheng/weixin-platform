package net.shangtech.weixin.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class UserProfileController {
	
	@RequestMapping({"", "/"})
	public String main(){
		
		return "platform.profile.main";
	}
	
	@ModelAttribute
	public void menu(Model model){
		model.addAttribute("menu", "profile");
	}
}
