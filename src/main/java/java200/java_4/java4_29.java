package java200.java_4;

import java.util.Scanner;

public class java4_29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		int total = 0;
		
	Outer:
		for (int i = 0; i <= 10; i++) {
			System.out.println(i+"그룹");
			for (int j = 0; j < 5; j++) {
				System.out.print("정수:");
				int t = scanner.nextInt();
				if (t == 99999)
					break Outer;
				else if (t == 88888)
					continue Outer;
				total += t;
			}
		}
	System.out.println("\n합계는" + total + "입니다."); 
	}
}
