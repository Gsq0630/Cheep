package org.lanqiao.myjd.controller;

import org.lanqiao.myjd.entity.Users;
import org.lanqiao.myjd.entity.UsersVo;
import org.lanqiao.myjd.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;


@RestController
public class UsersController {
    @Autowired
    UsersService usersService;


    @RequestMapping("/verify/checkUsersCard")
    public boolean selectUsersByCard(String usersCardid) {
        return usersService.selectUsersByCard(usersCardid);
    }

    @RequestMapping("/verify/insetUsers")
    public boolean insertUsers(@RequestBody UsersVo usersVo) {
        return usersService.insertUsers(usersVo);
    }

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
    }

}
