package com.springcore.Que_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAvg {
	public static void main(String[] args) {

		ApplicationContext obj = new ClassPathXmlApplicationContext("Que_2.xml");

		Avg2 g = (Avg2) obj.getBean("que2");
		g.avgno();
	}
}
