package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.entity.Users;
import org.lanqiao.myjd.entity.UsersVo;
import org.lanqiao.myjd.mapper.AccountMapper;
import org.lanqiao.myjd.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;
    @Autowired
    AccountMapper accountMapper;
//    @Override
//    public boolean selectUsersByName(String usersRealname) {
//        //如果数据有数据则返回false
//        return usersMapper.selectUsersByName(usersRealname) > 0 ? false : true;
//    }

    @Override
    public boolean selectUsersByCard(String usersCardid) {
        return usersMapper.selectUsersByCard(usersCardid) > 0 ? false : true;
    }

    @Override
    public List<Users> pagingQueryUsers(int currPage) {
        return usersMapper.pagingQueryUsers((currPage - 1) * 10);
    }

    @Override
    public int getMaxPage() {
        return usersMapper.getUsersCount() / 10 + 1;
    }

    @Override
    public boolean deleteUsers(Integer usersId) {
        return usersMapper.deleteByPrimaryKey(usersId) > 0;
    }

    @Override
    public boolean insertUsers(Users users) {
        return usersMapper.insertSelective(users) > 0;
    }

    @Override
    public boolean updateUsers(Users users) {
        return usersMapper.updateByPrimaryKeySelective(users) > 0;

    }

    @Override
    @Transactional
    public boolean insertUsers(UsersVo usersVo) {
        //插入成功返回true
        int uTag = usersMapper.insertUsers(usersVo.getUsers());

        //用accountMapper的修改操作来修改account中的usersid
        int aTag = accountMapper.updateAccUsersid(usersVo);

        return (uTag > 0 ? true : false) && (aTag > 0 ? true : false);


    }
}
