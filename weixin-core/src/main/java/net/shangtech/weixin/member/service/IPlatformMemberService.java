package net.shangtech.weixin.member.service;

import net.shangtech.framework.service.IBaseService;
import net.shangtech.weixin.member.entity.PlatformMember;

public interface IPlatformMemberService extends IBaseService<PlatformMember> {
	PlatformMember findByUsername(String username);
}
