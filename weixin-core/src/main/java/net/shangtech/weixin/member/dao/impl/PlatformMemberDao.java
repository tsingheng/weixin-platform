package net.shangtech.weixin.member.dao.impl;

import net.shangtech.framework.dao.hibernate.BaseDao;
import net.shangtech.weixin.member.dao.IPlatformMemberDao;
import net.shangtech.weixin.member.entity.PlatformMember;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformMemberDao extends BaseDao<PlatformMember> implements IPlatformMemberDao {

}
