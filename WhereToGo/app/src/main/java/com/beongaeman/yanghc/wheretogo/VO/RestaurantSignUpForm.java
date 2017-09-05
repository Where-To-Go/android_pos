package com.beongaeman.yanghc.wheretogo.VO;

public class RestaurantSignUpForm {
    private String owner_name;
    private String owner_email;
    private String owner_phone;
    private String owner_birth;
    private String passwd;
    private String company_registration_number;
    private String address;
    private double lat;
    private double lon;

    public RestaurantSignUpForm() {
//        System.out.println("aaaaaaaaaaaa"+getPasswd());
//        TimeZone tz = .getTimeZone();
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(String owner_phone) {
        this.owner_phone = owner_phone;
    }

    public String getOwner_birth() {
        return owner_birth;
    }

    public void setOwner_birth(String owner_birth) {
        this.owner_birth = owner_birth;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCompany_registration_number() {
        return company_registration_number;
    }

    public void setCompany_registration_number(String company_registration_number) {
        this.company_registration_number = company_registration_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }


}
