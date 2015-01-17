package net.shangtech.weixin.security;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class WeixinAuthenticationProvider implements AuthenticationProvider {

	@Autowired private UserDetailsService userDetailsService;
	
	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UserDetails user = userDetailsService.loadUserByUsername(authentication.getName());
		if(authentication.getCredentials() == null || StringUtils.isBlank(authentication.getCredentials().toString())){
			throw new BadCredentialsException("请输入密码");
		}
		if(!authentication.getCredentials().toString().equals(user.getPassword())){
			throw new BadCredentialsException("用户名或密码错误");
		}
		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials(), user.getAuthorities());
//		result.setDetails(user.get);
	    return result;
    }

	@Override
    public boolean supports(Class<?> authentication) {
	    // TODO Auto-generated method stub
	    return false;
    }

}
