package com.keizruniversity.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AccomodationStaff {
    
    private int Staff_id;
    private String Staff_FirstName;
    private String Staff_LastName;
    private String Street_Address;
    private String City;
    private String Province;
    private String zipCode;
    private String Date_Of_Birth;
    private String position;
    private String Sex;
    private String img;

    public AccomodationStaff() {
    }

    public AccomodationStaff(int Staff_id, String Staff_FirstName, String Staff_LastName, String Street_Address, String City, String Province, String zipCode, String Date_Of_Birth, String position, String Sex, String img) {
        this.Staff_id = Staff_id;
        this.Staff_FirstName = Staff_FirstName;
        this.Staff_LastName = Staff_LastName;
        this.Street_Address = Street_Address;
        this.City = City;
        this.Province = Province;
        this.zipCode = zipCode;
        this.Date_Of_Birth = Date_Of_Birth;
        this.position = position;
        this.Sex = Sex;
        this.img = img;
    }

    public int getStaff_id() {
        return Staff_id;
    }

    public void setStaff_id(int Staff_id) {
        this.Staff_id = Staff_id;
    }

    public String getStaff_FirstName() {
        return Staff_FirstName;
    }

    public void setStaff_FirstName(String Staff_FirstName) {
        this.Staff_FirstName = Staff_FirstName;
    }

    public String getStaff_LastName() {
        return Staff_LastName;
    }

    public void setStaff_LastName(String Staff_LastName) {
        this.Staff_LastName = Staff_LastName;
    }

    public String getStreet_Address() {
        return Street_Address;
    }

    public void setStreet_Address(String Street_Address) {
        this.Street_Address = Street_Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
