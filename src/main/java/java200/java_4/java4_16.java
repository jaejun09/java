package java200.java_4;

import java.util.Scanner;

public class java4_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 cm부터:");
		int hMin = scanner.nextInt();
		System.out.print("몇 cm까지:");
		int hMax = scanner.nextInt();
		int step = scanner.nextInt();
		System.out.println("신장 표준 체중:");
		System.out.println("----------");
		
		for (int i = hMin; i <= hMax; i += step) {
			System.out.println(i + "" + 0.9 * (i - 100));
		}
	}
}
