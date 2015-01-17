package net.shangtech.weixin.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Index;

import net.shangtech.framework.dao.support.BaseEntity;

/**
 * 微信用户<br/>
 * 关注了某个公众号的微信号
 * @author tsingheng
 *
 */
@Entity
@Table(name = "t_weixin_member")
public class WeixinMember extends BaseEntity<Long> {

    private static final long serialVersionUID = 908452071859730296L;

    @Index(name = "idx_weixin_member_open_account_id")
    @Column(name = "open_account_id")
    private Long openAccountId;

	public Long getOpenAccountId() {
		return openAccountId;
	}

	public void setOpenAccountId(Long openAccountId) {
		this.openAccountId = openAccountId;
	}
    
}
