package net.shangtech.weixin.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

import net.shangtech.framework.dao.support.BaseEntity;

/**
 * 微信公众账号
 * @author tsingheng
 *
 */
@Table
@Entity(name = "t_open_account")
public class OpenAccount extends BaseEntity<Long> {

    private static final long serialVersionUID = -3314846410921683103L;

    @Index(name = "idx_open_account_platform_member_id")
    @Column(name = "platform_member_id")
    private Long platformMemberId;
    
    private String openid;
    
    private String appid;
    
    private String appkey;
    
    private String token;

	public Long getPlatformMemberId() {
		return platformMemberId;
	}

	public void setPlatformMemberId(Long platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
    
}
