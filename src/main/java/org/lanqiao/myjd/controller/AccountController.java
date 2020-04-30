package org.lanqiao.myjd.controller;
//
//<<<<<<< HEAD

import org.lanqiao.myjd.entity.Account;
//=======
//>>>>>>> d08824d4d19ccb2f12ed2056534f862d1d80c0e6
import org.lanqiao.myjd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;


    @RequestMapping("/register/checkphone")
    public boolean selectAccByPhone(long accPhone) {
        return accountService.selectAccByPhone(accPhone);
    }

    @RequestMapping("/register/checkname")
    public boolean selectAccByName(String accName) {
        return accountService.selectAccByName(accName);
    }

    @RequestMapping("/register/checkemail")
    public boolean selectAccByEmail(String accEmail) {
        return accountService.selectAccByEmail(accEmail);
    }

    @RequestMapping("/register/insertAccount")
    public boolean insertAcc( Account account) {

        return accountService.insertAcc(account);
    }
    @RequestMapping("/register/selectAccId")
    public int selectAccIdByName(HttpServletResponse response,String accName){
        Cookie cookie = new Cookie("accId", accountService.selectAccIdByName(accName)+"");
        cookie.setPath("/");
        response.addCookie(cookie);
        return accountService.selectAccIdByName(accName);
    }

    //登录验证账户
    @RequestMapping("/login/checkAccount")
    public boolean checkAccount(HttpServletResponse response, String str, String password) {
        Account account = accountService.checkAccount(str, password);
        if (account != null){
            Cookie cookie = new Cookie("accId", account.getAccId().toString());
            cookie.setPath("/");
            response.addCookie(cookie);
            return true;
        }
        return false;
    }

    //主页获取账户名称
    @RequestMapping("/login/getAccName")
    public String getAccName(String accId) {

        return accountService.getAccName(accId);
    }
}
