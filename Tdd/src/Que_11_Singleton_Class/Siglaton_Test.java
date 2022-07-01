package Que_11_Singleton_Class;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Que_11_Singleton_Class.Singleton_Class.SingletonCheck;

class Siglaton_Test {

	@Test
	void test() {
	Singleton_Class s1= Singleton_Class.getSingleton();
	Singleton_Class s2= Singleton_Class.getSingleton();
      assertTrue(SingletonCheck.checksingleton(s1, s2));
	}
}