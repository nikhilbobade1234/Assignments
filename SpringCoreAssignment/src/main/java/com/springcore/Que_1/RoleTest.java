package com.springcore.Que_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("que1.xml");
	
	Role o1=(Role) obj.getBean("que1");
	o1.show();
	
}
}
