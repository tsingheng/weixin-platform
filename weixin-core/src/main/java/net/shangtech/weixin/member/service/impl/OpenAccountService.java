package net.shangtech.weixin.member.service.impl;

import java.util.Date;

import net.shangtech.framework.service.BaseService;
import net.shangtech.weixin.member.dao.IOpenAccountDao;
import net.shangtech.weixin.member.entity.OpenAccount;
import net.shangtech.weixin.member.service.IOpenAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class OpenAccountService extends BaseService<OpenAccount> implements IOpenAccountService {

	@Autowired private IOpenAccountDao dao;

	@Override
	public void save(OpenAccount model){
		Assert.notNull(model.getPlatformMemberId());
		OpenAccount account = new OpenAccount();
		account.setAppid(model.getAppid());
		account.setAppkey(model.getAppkey());
		account.setCreateTime(new Date());
		account.setIsDefault(false);
		account.setPlatformMemberId(model.getPlatformMemberId());
		account.setOpenid(model.getOpenid());
		account.setToken(model.getToken());
		dao.save(account);
	}
}
