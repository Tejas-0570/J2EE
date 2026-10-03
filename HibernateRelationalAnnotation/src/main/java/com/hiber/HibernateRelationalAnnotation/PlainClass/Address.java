package com.hiber.HibernateRelationalAnnotation.PlainClass;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int pinCode;
	private String city;
	private String state;
	private String country;
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
