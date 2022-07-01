package Que_9_Removecase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Case_Test {

	@Test
	void test() {
		assertEquals("This  Red car",RemoveCase.cheak("This @ Red $car-"));
	}

}
