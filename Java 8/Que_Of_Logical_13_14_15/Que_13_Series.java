package Que_Of_Logical_13_14_15;

public class Que_13_Series {
public static void main(String[] args) {
	int a[]= {1,2,3,6,7,8,9,10,11,12,13,14,17,18,19,20};
	for(int i=0;i<a.length;i++) {
		if(i<=4) {
		System.out.println(" ===");
			String b=a[i]+"-"+(a[i+2]);
			System.out.print(b+", ");
			i=i+2;
			System.out.println(" 777777");
		}else if(i<=10) {
			System.out.println(" *****");
			String c=a[i+1]+"-"+(a[i+5]);
			System.out.print(c+", ");
			i=i+4;
			System.out.println();
		}else {
			
			String d=a[i+1]+"-"+(a[i+4]);
			System.out.print(d+", ");
			i=i+4;
		}
	}
}
}
//1-3,6-8,10-14,17-20
