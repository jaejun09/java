package ocjp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex1 {
	private static Logger LOGGER = LoggerFactory.getLogger(Ex1.class);
	
	public static int sum(List<Integer> list) {
		int sum = 0;
//		for ( Iterator iter = list.iterator(); iter.hasNext(); ) {
		for (int i : list) {
			
		//int i = ((Integer)iter.next()).intValue();
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum = sum(list);
		LOGGER.debug("sum :" + sum);
	}
}
