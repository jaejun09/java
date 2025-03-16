package dad.dad04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test3 {
	private static Logger LOGGER = LoggerFactory.getLogger(Test3.class);
	
	public static void main(String[] args) {
				
//		int MAX = 9;
//		
//		for (int i = 0; i < MAX; i++) { 
//			// "" 찍기
//			if (i <= 4) {
//				for (int space = 5; space > i; space--) {
//			if (space >= 5) {
//					System.out.print(" ");
//			}
//					System.out.print(" ");
//				}
//			}
//			else {
//				int num = i - 3;
//				for (int space = 0; space < num; space++) {
//					System.out.print(" ");
//					
//				}
//			}
//			
//			
//			// * 찍기
//			int num = 0;
//			if (i <= (MAX / 2)) {
//				num = i * 2 + 1;
//			}
//			else {
//				num = MAX - (i - (MAX / 2)) * 2;
//			}
//			
//			for (int j = 1; j <= num; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		int MAX_ROW = 19;
		
		for (int i = 0; i < MAX_ROW; i++) {
			
			// 찍을 * 개수를 산정한다.
			int starNum = 0;
			
			// 찍을 공백 개수를 산정한다.
			int spaceNum = 0;
			
			if (i <= (MAX_ROW / 2)) {
				starNum = MAX_ROW - (2 * i);
				spaceNum = i;
			}
			else {
				starNum = 2 * i - (MAX_ROW - 2);
				spaceNum = MAX_ROW - (i + 1);
			}
			
			// 공백을 찍는다.
			for (int j = 0; j < spaceNum; j++) {
				System.out.print(" ");
			}			
			
			// *을 찍는다.
			for (int j = 0; j < starNum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
