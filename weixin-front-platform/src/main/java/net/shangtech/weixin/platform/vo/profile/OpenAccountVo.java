package net.shangtech.weixin.platform.vo.profile;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public abstract class OpenAccountVo implements Serializable {
	
	private static final long serialVersionUID = -6897483907940498410L;

	@NotEmpty
	private String appid;
	
	@NotEmpty
	private String appkey;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String weixinId;

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
