package net.shangtech.weixin.member.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import net.shangtech.framework.dao.support.BaseEntity;

/**
 * 系统运营账号
 * @author tsingheng
 *
 */
@Entity
@Table(name = "t_weixin_manager")
public class PlatformManager extends BaseEntity<Long> {

    private static final long serialVersionUID = -8969165486696171657L;

}
