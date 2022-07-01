package Que_2_Pallindrome;



public class CheakPallindromeString {
public static boolean cheak(String s1,String s2) {
	char[]a=s1.toCharArray();
	int j=a.length-1;
	int i=0;
	while(i<j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	String str=new String(a);
	if(str.equals(s2)&&str.equals(s1)) {
		System.out.println(s1+" = Pallindrome");
		return true;
	}else {
		System.out.println(s2+"= not Pallindrome");
		return false;
	}
	
	
	
}

}
