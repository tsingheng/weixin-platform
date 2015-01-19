package net.shangtech.weixin.platform.security;

import net.shangtech.weixin.member.entity.OpenAccount;
import net.shangtech.weixin.member.entity.PlatformMember;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.context.SecurityContextHolder;

@Aspect
public class RequestAspect {
	
	@Before("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void setMember(JoinPoint jp){
		if(SecurityContextHolder.getContext().getAuthentication() == null){
			return;
		}
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		PlatformMemberUser user = null;
		if(principal instanceof PlatformMemberUser){
			user = (PlatformMemberUser) principal;
		} else {
			return;
		}
		Object[] args = jp.getArgs();
		if(args != null){
			for(Object arg : args){
				if(arg instanceof PlatformMember){
					BeanUtils.copyProperties(user.getMember(), arg);
				}
				if(arg instanceof OpenAccount){
					BeanUtils.copyProperties(user.getAccount(), arg);
				}
			}
		}
	}
	
}
