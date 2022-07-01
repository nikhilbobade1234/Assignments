package Que_12_ClonedObject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcloneobject {

	@Test
	void test() throws CloneNotSupportedException {
		Employee e1=new Employee(1,"Nikhil");
		Employee e2=(Employee)e1.clone();
		assertEquals(true, Employee.cheak(e1, e2));
	}

}
