package java200.java_5;

import java.util.Scanner;

public class java5_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
		System.out.print("x : ");
		float x = scanner.nextFloat();
		System.out.print("y :");
		double y = scanner.nextDouble();
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}
}
