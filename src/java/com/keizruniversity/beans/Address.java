package com.keizruniversity.beans;

public class Address {
	
	private String streetAddr;
	private String city;
	private String province;
	private String zipCode;
	
	public Address() {}

	public Address(String streetAddr, String city, String province, String zipCode) {
		super();
		this.streetAddr = streetAddr;
		this.city = city;
		this.province = province;
		this.zipCode = zipCode;
	}

	public String getStreetAddr() {
		return streetAddr;
	}

	public void setStreetAddr(String streetAddr) {
		this.streetAddr = streetAddr;
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
	
	
}
