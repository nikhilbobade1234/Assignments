package Que_9_Removecase;

public class RemoveCase {
public static String cheak (String a) {
	
	String d=a.replaceAll("[@$-.]","");
	return d;
	
}
public static void main(String[] args) {
	 System.out.println(RemoveCase.cheak("This @ Red $car-"));
}
}
