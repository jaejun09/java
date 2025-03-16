package ocjp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex3 {
	private static Logger LOGGER = LoggerFactory.getLogger(Ex3.class);
	static void test() throws NumberFormatException {
		LOGGER.debug("test");
		try {
			int a = Integer.parseInt("abc");
			LOGGER.debug("a = " + a);
		}
		catch (NumberFormatException ex) {
			LOGGER.error("숫자의 형식이 아닙니다.");			
			throw ex;
		}
		finally {
			LOGGER.error("1");
		}
	}
	
	static void test2() throws FileNotFoundException {
		File f = new File("aaa.txt");
		try {
			LOGGER.debug("Test1");
			int a = Integer.parseInt("abc");
			LOGGER.debug("Test2");
			FileInputStream fis = new FileInputStream(f);
			LOGGER.debug("Test3");
		}
		catch (FileNotFoundException ex) {
			LOGGER.error("FileNotFound");
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		try {
			test2();
		}
		catch (NumberFormatException ex) {
			LOGGER.error("Test에서 숫자형식아닌 에러 발생.");
		}
		catch (FileNotFoundException ex) {
			LOGGER.error("file 없음");
		}
		finally {
			LOGGER.error("2");
		}
	}
}
