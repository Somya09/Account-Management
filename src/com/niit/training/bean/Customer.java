package com.niit.training.bean;

import java.util.ArrayList;

public class Customer extends User {
	ArrayList<Account> myaccounts=new ArrayList<Account>();
	
	
public ArrayList<Account> getMyaccounts() {
		return myaccounts;
	}
	public void setMyaccounts(ArrayList<Account> myaccounts) {
		this.myaccounts = myaccounts;
	}
private String shippingAddress;
   private String permanentAddress;
public String getShippingAddress() {
	return shippingAddress;
}
public void setShippingAddress(String shippingAddress) {
	this.shippingAddress = shippingAddress;
}
public String getPermanentAddress() {
	return permanentAddress;
}
public void setPermanentAddress(String permanentAddress) {
	this.permanentAddress = permanentAddress;
}
   
}
