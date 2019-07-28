package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.CustomerBo;

public class Pradeep {

	public static void main(String args[]) throws Exception{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		//customer.addCustomer();
		customer.addCustomerThrowException();
		
	}
}
