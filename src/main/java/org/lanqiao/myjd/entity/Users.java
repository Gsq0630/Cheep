package org.lanqiao.myjd.entity;

public class Users {
    private Integer usersId;

    private String usersRealname;

    private String usersCardid;

    private String usersSex;

    private String usersAddress;

    private Integer usersPostid;

    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersRealname() {
        return usersRealname;
    }

    public void setUsersRealname(String usersRealname) {
        this.usersRealname = usersRealname == null ? null : usersRealname.trim();
    }

    public String getUsersCardid() {
        return usersCardid;
    }

    public void setUsersCardid(String usersCardid) {
        this.usersCardid = usersCardid == null ? null : usersCardid.trim();
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex == null ? null : usersSex.trim();
    }

    public String getUsersAddress() {
        return usersAddress;
    }

    public void setUsersAddress(String usersAddress) {
        this.usersAddress = usersAddress == null ? null : usersAddress.trim();
    }

    public Integer getUsersPostid() {
        return usersPostid;
    }

    public void setUsersPostid(Integer usersPostid) {
        this.usersPostid = usersPostid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "usersId=" + usersId +
                ", usersRealname='" + usersRealname + '\'' +
                ", usersCardid='" + usersCardid + '\'' +
                ", usersSex='" + usersSex + '\'' +
                ", usersAddress='" + usersAddress + '\'' +
                ", usersPostid=" + usersPostid +
                ", account=" + account +
                '}';
    }


}