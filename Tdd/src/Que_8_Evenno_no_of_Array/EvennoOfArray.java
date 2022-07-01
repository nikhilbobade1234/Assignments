package Que_8_Evenno_no_of_Array;

public class EvennoOfArray {
	public static int CountingEvenOdd(int arr[]) {
		int even_count = 0;
		int odd_count = 0;

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] & 1) == 1)
				odd_count++;
			else
				even_count++;
		}

		System.out.println("Number of even" + " elements = " + even_count);
		return even_count;
	}

}
