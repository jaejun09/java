package com.jjbae.app.clock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClockPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(ClockPanel.class);

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");

	private String currentTime;
	
	public ClockPanel() {
		initComponent();
		initTime();
		initThread();
	}
	
	private void initComponent() {
		this.setBackground(Color.red);
	}
	
	private void initTime() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		/*
		LOGGER.debug("YEAR :" + cal.get(Calendar.YEAR));	
		LOGGER.debug("MONTH :" + (cal.get(Calendar.MONTH) + 1));
		LOGGER.debug("Day :" + cal.get(Calendar.DATE));
		LOGGER.debug("HOUR :" + cal.get(Calendar.HOUR_OF_DAY));
		LOGGER.debug("MIN :" + cal.get(Calendar.MINUTE));
		LOGGER.debug("SCD :" + cal.get(Calendar.SECOND));
		
		LOGGER.debug(String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				cal.get(Calendar.YEAR), 
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND)
				));
		*/		
		
		
		currentTime = sdf.format(date);
		
		LOGGER.debug(currentTime + "(" + Thread.activeCount() + ")");
	}
	
	private void initThread() {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Thread.sleep(1000);	
					}
					catch (InterruptedException e) {
						LOGGER.error(e.getMessage(), e);
					}
					
					// 1초마다 처리.
					initTime();
					repaint();
				}
			}
		}, "TimeCollector");
		
		t.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("DialogInput", Font.BOLD, 20));
		g.drawString(currentTime, 65, 100);
	}
}
