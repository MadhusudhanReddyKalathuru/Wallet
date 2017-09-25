package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class RecipientBean
{
    String id;
    String userId;
    String firstname;
    String lastname;
    String mailid;
    String password;
    String dateofbirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "RecipientBean{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mailid='" + mailid + '\'' +
                ", password='" + password + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                '}';
    }
}
