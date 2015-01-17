package net.shangtech.weixin.member.service.impl;

import java.util.List;

import net.shangtech.framework.service.BaseService;
import net.shangtech.weixin.member.dao.IPlatformMemberDao;
import net.shangtech.weixin.member.entity.PlatformMember;
import net.shangtech.weixin.member.service.IPlatformMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
@Transactional
public class PlatformMemberService extends BaseService<PlatformMember> implements IPlatformMemberService {

	@Autowired private IPlatformMemberDao dao;

	@Override
    public PlatformMember findByUsername(String username) {
	    List<PlatformMember> list = dao.findByProperty("username", username);
	    if(!CollectionUtils.isEmpty(list)){
	    	return list.get(0);
	    }
	    return null;
    }
}
