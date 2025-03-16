package ocjp2;

public class Ex1 {
	static void test() throws NumberFormatException {
		try {
			System.out.println("test");
			throw new RuntimeException();
		}
		catch (Exception ex) {
			System.out.println("exception");
			throw ex;
		}
	}

	public static void main(String[] args) {
		try {
			test();
		}
		catch (RuntimeException ex) {
			System.out.println("runtime");
		}
		System.out.println("End");
	}
}

