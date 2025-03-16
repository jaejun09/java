package com.jjbae.app.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Work extends Thread {
	private static Logger LOGGER = LoggerFactory.getLogger(Work.class);
	
	private int num;
	
	public Work(int num) {
		this.num = num;
	}
	
	public void run() {
		LOGGER.debug(String.format("+++ [%s] start", num));
		
		try {
			Thread.sleep(1000);	
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
		
		LOGGER.debug(String.format("+++ [%s] end", num));
	}
}
