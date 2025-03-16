package dad.dad04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test2 {
	private static Logger LOGGER = LoggerFactory.getLogger(Test2.class);
	
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int k = 5; k >= 1; k--) {
//			for (int l = 1; l <= k; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int MAX = 9;
		
		for (int i = 0; i < MAX; i++) { 
			// "" 찍기
			if (i <= 4) {
				for (int space = 5; space > i; space--) {
//				if (space >= 5) {
//					System.out.print(" ");
//				}
					System.out.print(" ");
				}
			}
			else {
				int num = i - 3;
				for (int space = 0; space < num; space++) {
					System.out.print(" ");
					
				}
			}
			
			
			// * 찍기
			int num = 0;
			if (i <= (MAX / 2)) {
				num = i * 2 + 1;
			}
			else {
				num = MAX - (i - (MAX / 2)) * 2;
			}
			
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
