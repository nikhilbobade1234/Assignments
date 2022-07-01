package Que_11_Singleton_Class;

import java.util.HashMap;
import java.util.Map;

public class Singleton_Class {

	private static Singleton_Class st = new Singleton_Class();


	private Singleton_Class() {
	}
		public static Singleton_Class getSingleton() { 
			return st;
		}
	public class SingletonCheck { 
		public static boolean checksingleton (Singleton_Class st1, Singleton_Class st2) {
		if (st1.hashCode() == st2.hashCode()) {
			return true;
	} else 
		return false;


   
 }
}
}