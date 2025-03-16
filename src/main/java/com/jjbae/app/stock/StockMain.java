package com.jjbae.app.stock;

import javax.swing.UIManager;

public class StockMain {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		StockFrame stockFrame = new StockFrame();
		stockFrame.setSize(600, 400);
		stockFrame.setVisible(true);
	}
	
	
}
