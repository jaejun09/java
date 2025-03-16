package java200.java_4;

import java.util.Random;
import java.util.Scanner;


public class java4_30 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int no = rand.nextInt(100);
		
		System.out.println("game starts");
		System.out.println("Guess number between 0 to 99");
		
		int x;
		do {
			System.out.print("chance:" + (leftNo--) + "");
			x = scanner.nextInt();
			
			if (x > no)
				System.out.println("Lower");
			else if(x < no)
				System.out.println("Bigger");
		
		}
		while (x != no && leftNo > 0);
		
		if (x == no)
			System.out.println("correct.");
		else
			System.out.println("wrong answer. game ended");
	}
}
