package com.springcore.Que_15;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {       
	List<Customer>slist =new ArrayList<Customer>();
	ApplicationContext obj = new ClassPathXmlApplicationContext("que15.xml");
	Customer c=(Customer) obj.getBean("CustID");
	c.display();
	
	
}
}
