package dad.dad04;

public class Calculator {
	public static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public static int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public static int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public static int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}
	
	public static int square(int a) {
		return pow(a, 2);
	}
	
	public static int pow(int a, int b) {
		int num = 1;
		for (int i = 0; i < b; i++) {
			num = num * a;
		}
		return num;
	}
	
	public static double root(int a) {
	    double x = 2;

	    for (int i = 0; i < 10; i++) {
	        x = (x + (a / x)) / 2;
	    }

	    return x;		
	}
}
