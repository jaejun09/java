package ocjp2;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex2 {
	private static Logger LOGGER = LoggerFactory.getLogger(Ex2.class);
	
	static void test() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("첫번째 숫자를 입력하세요(x:종료) : ");
				String num1 = scanner.next();
				if (num1.toLowerCase().equals("x")) {
					break;
				}
				
				double a = Double.parseDouble(num1);
				System.out.print("두번째 숫자를 입력하세요 : ");
				double b = scanner.nextDouble();
				double div = a / b;
				System.out.println(String.format("나눈 결과는 %s 입니다.", div));
			}
			catch (InputMismatchException | ArithmeticException | NumberFormatException ex) {
				System.out.println("잘못된 입력입니다.");
			}
//			catch (InputMismatchException ex) {
//				System.out.println("input missmatched");
//			}
//			catch (ArithmeticException ex) {
//				System.out.println("Arithmetic error");
//			}
//			catch (NumberFormatException ex) {
//				System.out.println("Number format error");
//			}
		}
	}
	public static void main(String[] args) {
		//test();
		
		String a = null;
		System.out.println("a.length:" + a.length());
	} 
}
