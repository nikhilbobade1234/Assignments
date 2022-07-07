package com.springcore.Que_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("que_8.xml");
	Item i1=(Item) obj.getBean("que8");
	i1.show();
	System.out.println("============");
	i1.ascending();
	System.out.println("===========");
	i1.descending();
	System.out.println("================");
	i1.removeduplicate();
}
}
