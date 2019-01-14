package com.keizruniversity.beans;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HallOfResidence {
    private int hallID;
    private String hallName;
    private String strAddr;
    private String city;
    private String province;
    private String zipCode;
    private List<AccomodationStaff> staff;
    private String phoneNum;
    private String hallManager;
    private String roomNum;
    private String placeNum;
    private String mntlyRate;
    private String img;

    public HallOfResidence() {
    }

    public HallOfResidence(int hallID, String hallName, String strAddr, String city, String province, String zipCode, List<AccomodationStaff> staff, String phoneNum, String hallManager, String roomNum, String placeNum, String mntlyRate, String img) {
        this.hallID = hallID;
        this.hallName = hallName;
        this.strAddr = strAddr;
        this.city = city;
        this.province = province;
        this.zipCode = zipCode;
        this.staff = staff;
        this.phoneNum = phoneNum;
        this.hallManager = hallManager;
        this.roomNum = roomNum;
        this.placeNum = placeNum;
        this.mntlyRate = mntlyRate;
        this.img = img;
    }

    public int getHallID() {
        return hallID;
    }

    public void setHallID(int hallID) {
        this.hallID = hallID;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getStrAddr() {
        return strAddr;
    }

    public void setStrAddr(String strAddr) {
        this.strAddr = strAddr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<AccomodationStaff> getStaff() {
        return staff;
    }

    public void setStaff(List<AccomodationStaff> staff) {
        this.staff = staff;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHallManager() {
        return hallManager;
    }

    public void setHallManager(String hallManager) {
        this.hallManager = hallManager;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getPlaceNum() {
        return placeNum;
    }

    public void setPlaceNum(String placeNum) {
        this.placeNum = placeNum;
    }

    public String getMntlyRate() {
        return mntlyRate;
    }

    public void setMntlyRate(String mntlyRate) {
        this.mntlyRate = mntlyRate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
