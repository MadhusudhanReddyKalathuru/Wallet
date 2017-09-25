package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/22/2017.
 */

public class ForgotPwdBean
{

    String emailid;
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "ForgotPwdBean{" +
                "emailid='" + emailid + '\'' +
                '}';
    }
}
