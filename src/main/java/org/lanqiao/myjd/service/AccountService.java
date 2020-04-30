package org.lanqiao.myjd.service;


import org.lanqiao.myjd.entity.Account;
import org.springframework.stereotype.Service;
@Service
public interface AccountService {
    public boolean selectAccByPhone(long accPhone);
    public boolean selectAccByName(String accName);
    public boolean selectAccByEmail(String accEmail);
//    public boolean updateAccUsersId(String accName,int usersId);
    public boolean insertAcc(Account account);
    public int selectAccIdByName(String accName);
    Account checkAccount(String input, String password);
    String getAccName(String accId);
}
