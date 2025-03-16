package java200.java_5;

import java.util.Scanner;

public class java5_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수:");
		int x = scanner.nextInt();
		
		System.out.printf(" 8진수는 %o입니다.\n", x);
		System.out.printf("16진수는 %x입니다.\n", x);
	}
}
