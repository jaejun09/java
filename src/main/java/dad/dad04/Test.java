package dad.dad04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private static Logger LOGGER = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {	
//			LOGGER.debug("-----" + i + "단-----");
			LOGGER.debug(String.format("----- %d단 -----", i));
			for (int k = 1; k <= 9; k++) {
				LOGGER.debug(String.format("%d * %d = %d", i, k, i * k));
			}
		}
	}
}
