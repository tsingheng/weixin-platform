package net.shangtech.weixin.member.service.impl;

import net.shangtech.framework.service.BaseService;
import net.shangtech.weixin.member.dao.IWeixinMemberDao;
import net.shangtech.weixin.member.entity.WeixinMember;
import net.shangtech.weixin.member.service.IWeixinMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WeixinMemberService extends BaseService<WeixinMember> implements IWeixinMemberService {

	@Autowired private IWeixinMemberDao dao;

}
