package net.shangtech.weixin.member.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.shangtech.framework.dao.support.BaseEntity;

import org.hibernate.annotations.Index;

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
    
    private String title;
    
    @Column(name = "weixin_id")
    private String weixinId;
    
    private String openid;
    
    private String appid;
    
    private String appkey;
    
    private String token;
    
    @Column(name = "is_default")
    private Boolean isDefault;
    
    @Column(name = "create_time")
    private Date createTime;

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

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}
    
}
