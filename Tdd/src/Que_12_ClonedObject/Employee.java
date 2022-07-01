package Que_12_ClonedObject;

public class Employee implements Cloneable{
	int id;
	String ename;

	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static boolean cheak(Employee e1, Employee e2) {
		if (e1.id== e2.id && e1.ename==e2.ename)
			return true;

		else

			return false;

	}

	
}
