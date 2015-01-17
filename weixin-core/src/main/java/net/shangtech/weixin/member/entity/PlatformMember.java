package net.shangtech.weixin.member.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

import net.shangtech.framework.dao.support.BaseEntity;

/**
 * 平台用户<br/>
 * 使用该平台的商家账号
 * @author tsingheng
 *
 */
@Entity
@Table(name = "t_platform_member")
public class PlatformMember extends BaseEntity<Long> {

    private static final long serialVersionUID = -332871699312013422L;
    
    @Index(name = "idx_platform_member_username")
    private String username;
    
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
