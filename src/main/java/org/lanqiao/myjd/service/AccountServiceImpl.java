package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override

    public boolean selectAccByPhone(long accPhone) {
        return accountMapper.selectAccByPhone(accPhone) < 1 ? true : false;
    }

    @Override
    public boolean selectAccByName(String accName) {
        return accountMapper.selectAccByName(accName) < 1 ? true : false;
    }

    @Override
    public boolean selectAccByEmail(String accEmail) {
        return accountMapper.selectAccByEmail(accEmail) < 1 ? true : false;
    }


//    @Override
//    public boolean updateAccUsersId(String accName,int usersId) {
//        return accountMapper.updateAccUsersid(accName,usersId)>0?true:false;
//    }

    @Override
    public boolean insertAcc(Account account) {
        return accountMapper.insertAcc(account)>0?true:false;

    }

    @Override
    public int selectAccIdByName(String accName) {
        return accountMapper.selectAccIdByName(accName);
    }

    public Account checkAccount(String str, String password) {
        return accountMapper.selectByLogin(str, password);
    }

    @Override
    public String getAccName(String accId) {
        Integer id = Integer.parseInt(accId);
        return accountMapper.getAccName(id);
    }
}
