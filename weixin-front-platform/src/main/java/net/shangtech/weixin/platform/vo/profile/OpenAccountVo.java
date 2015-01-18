package net.shangtech.weixin.platform.vo.profile;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public abstract class OpenAccountVo implements Serializable {
	
	private static final long serialVersionUID = -6897483907940498410L;

	@NotNull
	private String appid;
	
	@NotNull
	private String appkey;

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
	
}
