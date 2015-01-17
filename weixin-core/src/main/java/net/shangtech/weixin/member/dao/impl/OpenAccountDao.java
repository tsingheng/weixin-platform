package net.shangtech.weixin.member.dao.impl;

import net.shangtech.framework.dao.hibernate.BaseDao;
import net.shangtech.weixin.member.dao.IOpenAccountDao;
import net.shangtech.weixin.member.entity.OpenAccount;
import org.springframework.stereotype.Repository;

@Repository
public class OpenAccountDao extends BaseDao<OpenAccount> implements IOpenAccountDao {

}
