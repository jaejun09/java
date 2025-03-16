package ocjp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.checkerframework.checker.units.qual.N;

public class Ex2 {
	private static Logger LOGGER = LoggerFactory.getLogger(Ex2.class);
	


	public static void main(String[] args) {
		MinMax minMax = new MinMax();
		minMax.add(10L);
		minMax.add(6);
		minMax.add(66);
		minMax.add(3);
		minMax.add(2.9);
		minMax.add(55);
		
		LOGGER.debug("Min : " + minMax.getMin());
		LOGGER.debug("Max :" + minMax.getMax());
	}
}

