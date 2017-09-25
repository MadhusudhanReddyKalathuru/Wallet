package com.wallet.model;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

public class RegistrationBean
{
    String id;
    String firstname;
    String lastname;
    String mailid;
    String dateofbirth;
    String country;
    String address1;
    String address2;
    String city;
    String pincode;
    String userloginid;
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

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getUserloginid() {
        return userloginid;
    }

    public void setUserloginid(String userloginid) {
        this.userloginid = userloginid;
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
        return "RegistrationBean{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mailid='" + mailid + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", country='" + country + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", userloginid='" + userloginid + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate='" + createddate + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", Modifieddate='" + Modifieddate + '\'' +
                '}';
    }
}
