package Que_7_Pallindromenumber;

import java.util.function.BooleanSupplier;

public class Pallindrome {
public static boolean cheak(int a) {
	int r;
	int n=0;
	int temp;
	int sum=0;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
		if(temp==sum) 
			return true;
		else 
			return false;
	}


	
	}
	

