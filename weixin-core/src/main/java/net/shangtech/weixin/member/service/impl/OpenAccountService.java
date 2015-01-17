package net.shangtech.weixin.member.service.impl;

import net.shangtech.framework.service.BaseService;
import net.shangtech.weixin.member.service.IOpenAccountService;
import net.shangtech.weixin.member.entity.OpenAccount;
import net.shangtech.weixin.member.dao.IOpenAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OpenAccountService extends BaseService<OpenAccount> implements IOpenAccountService {

	@Autowired private IOpenAccountDao dao;


}
