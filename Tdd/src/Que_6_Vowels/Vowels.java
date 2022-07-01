package Que_6_Vowels;

public class Vowels {
	public static int cheak(String a) {

		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				count++;

			}

		}
		return count;

	}

	

	}

