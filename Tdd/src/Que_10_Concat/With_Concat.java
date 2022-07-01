package Que_10_Concat;

public class With_Concat {
public static String cheak(String a[]) {
	String s="";
	for(int i=0;i<a.length;i++) {
		if(i==a.length-1)
			s+=a[i];
		else
			s+=a[i]+"-";
	}
	return s;
	
}
}
