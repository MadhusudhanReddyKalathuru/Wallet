package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class TransactionBean
{
    String id;
    String userid;
    String recepentid;
    String bankdetailid;
    String amount;
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

    public String getRecepentid() {
        return recepentid;
    }

    public void setRecepentid(String recepentid) {
        this.recepentid = recepentid;
    }

    public String getBankdetailid() {
        return bankdetailid;
    }

    public void setBankdetailid(String bankdetailid) {
        this.bankdetailid = bankdetailid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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
        return "TransactionBean{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", recepentid='" + recepentid + '\'' +
                ", bankdetailid='" + bankdetailid + '\'' +
                ", amount='" + amount + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate='" + createddate + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", Modifieddate='" + Modifieddate + '\'' +
                '}';
    }
}
