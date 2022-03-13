package com.prowings.basics.deepcloning;

public class Address implements Cloneable {
	String city;
	String country;
	int pin;
	
	public Address() {
		super();
	}

	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
