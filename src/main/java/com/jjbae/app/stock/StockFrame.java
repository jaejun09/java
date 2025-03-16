package com.jjbae.app.stock;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockFrame extends JFrame {
	private static Logger LOGGER = LoggerFactory.getLogger(StockFrame.class);
	
	private StockPanel stockPanel = new StockPanel();
	
	public StockFrame() {
		try {
			initComponent();
		}
		catch(Exception ex) {
			LOGGER.error(ex.getMessage());
		}
	}
	
	private void initComponent() {
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setContentPane(stockPanel);
		this.setTitle("주식시세");
		
		// 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 확인후 종료
				int result = JOptionPane.showConfirmDialog(StockFrame.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
