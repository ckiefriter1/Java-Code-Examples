package UnitTesting;

public class Math {

	public int multiply(int a, int b) {
		 return a * b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public boolean isPositiveNumber(int a) {
		return a > 0;
	}

	
	public static void main(String[] args) {
		Math m = new Math();
		int a = 5;
		int b = 6;
		System.out.println(a + " * " + b + " = " + m.multiply(a, b));

	}

}
