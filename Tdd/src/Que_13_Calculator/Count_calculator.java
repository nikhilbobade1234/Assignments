package Que_13_Calculator;

public class Count_calculator {

	public static int sum(int a, int b) {
		int s = a + b;
		return s;

	}

	public static int sub(int a, int b) {
		int s2 = a - b;
		return s2;

	}

	public static int mult(int a, int b) {
		int s3 = a * b;
		return s3;

	}

	public static int div(int a, int b) {
		int s3 = 0;
		try {
			s3 = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Can't devide byb zero");
		}
		return s3;

	}

	public static double module(double a, double b) {
		double m1 = 0;

		try {

			m1 = a % b;

		} catch (Exception e) {
			System.out.println("Cant devide by zero");
		}
		return m1;
	}

	static double power(double a, double b) {
		double m1 = 0;
		
		if (a > 0 && b > 0) {
			m1 = Math.pow(a, b);
			return m1;
		} else {
			return 0;
		}
	}

	static double squareRoot(int n) throws Exception {
		double d=0;
		if(n<0) {
			throw new Exception("not a number");
		}
		else {
			 d = Math.sqrt(n);
		}
		
		return d;
	}

	static double CubeRoot(int n) {
		double d = Math.cbrt(n);
		return d;
	}

	
}
