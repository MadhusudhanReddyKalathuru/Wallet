package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class UserRegistrationBean {
    String firstname;
    String lastname;
    String mailid;
    String pwd;
    String dob;
    String createddate;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @Override
    public String toString() {
        return "UserRegistrationBean{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mailid='" + mailid + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dob='" + dob + '\'' +
                ", createddate='" + createddate + '\'' +
                '}';
    }
}
