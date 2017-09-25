package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class BankDetailBean
{
    String id;
    String bankname;
    String branch;
    String accountno;
    String ifsc;
    String createdby;
    String createddate;
    String modifiedby;
    String Modifieddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getModifieddate() {
        return Modifieddate;
    }

    public void setModifieddate(String modifieddate) {
        Modifieddate = modifieddate;
    }

    @Override
    public String toString() {
        return "BankDetailBean{" +
                "id='" + id + '\'' +
                ", bankname='" + bankname + '\'' +
                ", branch='" + branch + '\'' +
                ", accountno='" + accountno + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate='" + createddate + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", Modifieddate='" + Modifieddate + '\'' +
                '}';
    }
}
