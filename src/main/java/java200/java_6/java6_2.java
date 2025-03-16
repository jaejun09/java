package java200.java_6;

public class java6_2 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 5 - i;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
