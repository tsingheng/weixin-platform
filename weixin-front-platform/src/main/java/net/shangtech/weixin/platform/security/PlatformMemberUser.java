package net.shangtech.weixin.platform.security;

import java.util.Collection;

import net.shangtech.weixin.member.entity.PlatformMember;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class PlatformMemberUser extends User {

    private static final long serialVersionUID = 4561143824940022787L;
    
    private PlatformMember member;

	public PlatformMemberUser(String username, String password, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
	    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

	public PlatformMember getMember() {
		return member;
	}

	public void setMember(PlatformMember member) {
		this.member = member;
	}

}
