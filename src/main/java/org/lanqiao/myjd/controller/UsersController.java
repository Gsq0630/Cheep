package org.lanqiao.myjd.controller;

//<<<<<<< HEAD

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.entity.Users;
import org.lanqiao.myjd.entity.UsersVo;
import org.lanqiao.myjd.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//=======
//import org.lanqiao.myjd.entity.Users;
//import org.lanqiao.myjd.service.UsersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//
//>>>>>>> d08824d4d19ccb2f12ed2056534f862d1d80c0e6
@RestController
public class UsersController {
    @Autowired
    UsersService usersService;
//
//<<<<<<< HEAD
//    @RequestMapping("/checkUsersName")
//    public boolean selectUsersByName(String usersRealname) {
//        return usersService.selectUsersByName(usersRealname);
//    }

    @RequestMapping("/verify/checkUsersCard")
    public boolean selectUsersByCard(String usersCardid) {
        return usersService.selectUsersByCard(usersCardid);
    }

    @RequestMapping("/verify/insetUsers")
    public boolean insertUsers(@RequestBody UsersVo usersVo) {
        return usersService.insertUsers(usersVo);
    }

    //=======
    //分页获取用户列表，每页10条记录
    @RequestMapping("/backend/pagingQueryUsers")
    public List<Users> pagingQueryUsers(int currPage) {
        return usersService.pagingQueryUsers(currPage);
    }

    //获取用户表最大可选页数
    @RequestMapping("/backend/getMaxPage")
    public int getMaxPage() {
        return usersService.getMaxPage();
    }

    //删除用户及账户
    @RequestMapping("/backend/deleteUsersById")
    public boolean deleteUsers(Integer usersId) {
        return usersService.deleteUsers(usersId);
    }

    //后台添加用户
    @RequestMapping("/backend/insertUsers")
    public boolean insertUsers(Users users) {
        return usersService.insertUsers(users);
    }

    //后台修改用户信息
    @RequestMapping("/backend/updateUsers")
    public boolean updateUsers(Users users) {
        return usersService.updateUsers(users);
//>>>>>>> d08824d4d19ccb2f12ed2056534f862d1d80c0e6
    }

}
