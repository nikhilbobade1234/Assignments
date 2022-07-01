package Que_15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Iteam_cheak_object {

	@Test
	void test() {
		Iteam i=new Iteam(1, "Pen", 200, 500, LocalDate.of(2022, 11, 23), LocalDate.of(2023, 2, 10));
	assertEquals(true,i.createObject(i));
	}

	

}
