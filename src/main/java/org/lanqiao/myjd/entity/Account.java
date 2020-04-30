package org.lanqiao.myjd.entity;

import java.util.Date;

public class Account {
    private Integer accId;

    private String accName;

    private String accPassword;

    private Date accCreatedate;

    private Integer usersId;

    private String accEmail;

    private Long accPhone;

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword == null ? null : accPassword.trim();
    }

    public Date getAccCreatedate() {
        return accCreatedate;
    }

    public void setAccCreatedate(Date accCreatedate) {
        this.accCreatedate = accCreatedate;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getAccEmail() {
        return accEmail;
    }

    public void setAccEmail(String accEmail) {
        this.accEmail = accEmail == null ? null : accEmail.trim();
    }

    public Long getAccPhone() {
        return accPhone;
    }

    public void setAccPhone(Long accPhone) {
        this.accPhone = accPhone;
    }

}