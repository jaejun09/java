package java200.java_4;

import java.util.Scanner;

public class java4_27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?:");
		int n = scanner.nextInt();
		
		int i;
		int sum = 0;
		for (i = 0; i < n; i++) {
			System.out.print("정수:");
			int t = scanner.nextInt();
			if (sum + t > 1000) {
				System.out.println("Above the range");
				System.out.println("ignoring last num");
				break;
			}
			sum =+ t;
		}
		System.out.println("합계는:" + sum + "입니다.");
		if (i != 0)
			System.out.println("평균은" + sum / i + "입니다.");
	}
}
