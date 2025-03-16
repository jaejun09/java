package java200.java_4;

import java.util.Scanner;

public class java4_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단순는? : ");
		int n = scanner.nextInt();
		
		for (int i = 1;i <= n; i++) {
			for (int j= 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
