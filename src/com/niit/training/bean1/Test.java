package com.niit.training.bean1;

import java.util.ArrayList;

import com.niit.training.bean.Account;
import com.niit.training.bean.Admin;
import com.niit.training.bean.Customer;
import com.niit.training.bean.User;

public class Test {
	public static void main(String args[]){
		Customer c1=new Customer();
		
		c1.setPassword("Somy");
		User u=new User();
		u.setPassword("Somy");
		Admin ad=new Admin();
		ad.setRole("Administration");
		
		ArrayList<Account> al=new ArrayList<Account>();
	   Account ac =new Account();
	
	   ac.setNum(10001);
	   ac.setName("SB");
	   ac.setBranch("Janakpuri");
	  al.add(ac);
	  ac =new Account();
		
	   ac.setNum(10003);
	   ac.setName("hdfc");
	   ac.setBranch("haryana");
	   al.add(ac);
	  
	  
	for(Account ac1 :al)
	{
		System.out.println(ac1.getNum()+"  "+ac1.getName()+"  "+ac1.getBranch());
	}
	System.out.println(u.getPassword());
	System.out.println(ad.getRole());
	
	
	}
}
