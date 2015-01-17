package net.shangtech.weixin.member.dao.impl;

import net.shangtech.framework.dao.hibernate.BaseDao;
import net.shangtech.weixin.member.dao.IWeixinMemberDao;
import net.shangtech.weixin.member.entity.WeixinMember;
import org.springframework.stereotype.Repository;

@Repository
public class WeixinMemberDao extends BaseDao<WeixinMember> implements IWeixinMemberDao {

}
