package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class WalletBean
{
    String id;
    String userid;
    String amount;
    String currencytype;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
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
        return "WalletBean{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", amount='" + amount + '\'' +
                ", currencytype='" + currencytype + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate='" + createddate + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", Modifieddate='" + Modifieddate + '\'' +
                '}';
    }
}
