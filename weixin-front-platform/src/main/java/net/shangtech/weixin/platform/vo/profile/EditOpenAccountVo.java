package net.shangtech.weixin.platform.vo.profile;

import javax.validation.constraints.NotNull;

public class EditOpenAccountVo extends OpenAccountVo {

	private static final long serialVersionUID = 6039059920046726073L;

	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
