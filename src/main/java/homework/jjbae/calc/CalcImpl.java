package homework.jjbae.calc;

public class CalcImpl implements CalcInterface {

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int devide(int a, int b) {
		int result = a / b;
		return result;
	}

}
