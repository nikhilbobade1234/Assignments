package Que_10_Concat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",With_Concat.cheak(new String[] {"apple","orange","banana","lemon"}));
	}

}
