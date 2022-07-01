package Que_5_Paythagoras;

public class TheoremMethod {
	public static boolean cheak(int a,int b,int c) {
		int I=a*a;
		int J=b*b;
		int k=c*c;
		if(I==J+k ||J==I+k ||k==I+J)
		return true;
		else
			return false;
	}

}
