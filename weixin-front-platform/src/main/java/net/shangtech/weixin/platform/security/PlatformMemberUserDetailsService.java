package net.shangtech.weixin.platform.security;

import java.util.ArrayList;
import java.util.List;

import net.shangtech.weixin.member.entity.PlatformMember;
import net.shangtech.weixin.member.service.IPlatformMemberService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PlatformMemberUserDetailsService implements UserDetailsService {

	@Autowired private IPlatformMemberService memberService;
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(StringUtils.isBlank(username)){
			throw new UsernameNotFoundException("请输入用户名");
		}
		PlatformMember member = memberService.findByUsername(username);
	    if(member == null){
	    	throw new UsernameNotFoundException("用户名或密码错误");
	    }
	    List<GrantedAuthority> gas = new ArrayList<>();
	    gas.add(new SimpleGrantedAuthority("ROLE_PLATFORM_MEMBER"));
	    PlatformMemberUser user = new PlatformMemberUser(username, member.getPassword(), true, true, true, true, gas);
	    user.setMember(member);
	    return user;
    }

}
