package dad.dad04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorMain {
	private static Logger LOGGER = LoggerFactory.getLogger(CalculatorMain.class);
	
	public static void main(String[] args) {
		LOGGER.debug(String.format("2 + 2 = %d", Calculator.add(2, 2)));
		LOGGER.debug(String.format("2 - 2 = %d", Calculator.subtract(2, 2)));
		LOGGER.debug(String.format("2 * 2 = %d", Calculator.multiply(2, 2)));
		LOGGER.debug(String.format("2 / 2 = %d", Calculator.divide(2, 2)));
		LOGGER.debug(String.format("7 ^ 2 = %d", Calculator.square(7)));
		LOGGER.debug(String.format("2 ^ 10 = %d", Calculator.pow(2, 10)));
		LOGGER.debug(String.format("root 4 = %f", Calculator.root(4)));
	}
}
