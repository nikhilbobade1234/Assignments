package Que_8_Evenno_no_of_Array;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test_Even {

	@Test
	public void evenoddsolve() {

		assertEquals(6, EvennoOfArray.CountingEvenOdd(new int[] { 2, 6, 4, 6, 3, 22, 4, 5, 3, 3, 45 }));

	}

}
