package java200.java_4;

import java.util.Scanner;

public class java4_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정숫값:");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println(i + "의 제곱은 " + i * i + "입니다.");
		
	}
}
