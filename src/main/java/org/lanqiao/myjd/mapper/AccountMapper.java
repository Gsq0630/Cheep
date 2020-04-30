package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Account;

import org.lanqiao.myjd.entity.UsersVo;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    int selectAccByPhone(long accPhone);

    int selectAccByName(String accName);

    int updateAccUsersid(UsersVo usersVo);

    int selectAccByEmail(String accEmail);

    int insertAcc(Account account);

    int selectAccIdByName(String accName);

    int deleteByPrimaryKey(Integer accId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accId);

    Account selectByLogin(String str, String password);

    String getAccName(Integer accId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}