package com.jjbae.app.stock;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockPanel extends JPanel {
	private static Logger LOGGER = LoggerFactory.getLogger(StockPanel.class);
	
	private static final String NAVER_STOCK_URL = "https://finance.naver.com/item/main.naver?code=";
	
	private JPanel jPanel_Main = new JPanel();
	private JPanel jPanel_Pane = new JPanel();
	
	private JLabel jLabel_Name = new JLabel("품목명");
	private JTextField jTextField_Name = new JTextField();
	private JButton jButton_Search = new JButton("검색");
	private JButton jButton_Reload = new JButton("조회");
	private JScrollPane jScrollPane_Chart = new JScrollPane();
	private JTable jTable_Chart = new JTable();
	private DefaultTableModel tableModel = new DefaultTableModel();
	
	private GridBagLayout gridBagLayout = new GridBagLayout();
	
	private List<String> codeList = new ArrayList<>();
	
	public StockPanel() {
		initLayout();
		initComponent();
		initTable();
		initPreferredSize();
		initEvent();

		initStockCode();
		
		//collectCompany("012450");
		//collectCompany("005930");
		//collectCompany("005930");
		
	}
	
	public void initComponent() {
		
		this.add(jPanel_Main, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_Pane, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_Main.add(jLabel_Name, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jPanel_Main.add(jTextField_Name, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_Main.add(jButton_Search, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_Main.add(jButton_Reload, new GridBagConstraints(
				3, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_Pane.add(jScrollPane_Chart, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jScrollPane_Chart.getViewport().add(jTable_Chart);
	}
	
	public void initLayout() {
		this.setLayout(gridBagLayout);
		jPanel_Main.setLayout(gridBagLayout);
		jPanel_Pane.setLayout(gridBagLayout);
	}
	
	public void initPreferredSize() {
		jLabel_Name.setPreferredSize(new Dimension(100, 24));
		jTextField_Name.setPreferredSize(new Dimension(100, 24));
		jButton_Search.setPreferredSize(new Dimension(100, 24));
		jButton_Reload.setPreferredSize(new Dimension(100, 24));
	}
	
	private void initStockCode() {
		codeList.add("005930");
		codeList.add("012450");
		codeList.add("225570");
		codeList.add("105560");
		codeList.add("005380");
	}
	
	private void initTable() {
		Vector<String> columns = new Vector<>();
		columns.add("종목코드");
		columns.add("종목명");
		columns.add("현재가");
		columns.add("전일대비");
		
		tableModel.setColumnIdentifiers(columns);
		
		jTable_Chart.setModel(tableModel);
		jTable_Chart.setRowHeight(22);
	}
	
	private void initEvent() {
		jButton_Reload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				initData();
			}		
		});
	}
	
	private void initData() {
		for (int i = 0; i < codeList.size(); i++) {
			String code = codeList.get(i);
			StockVo stockVo = collectCompany(code);
		
		
			Vector oneData = new Vector();
			oneData.add(stockVo.getCode());
			oneData.add(stockVo.getName());
			oneData.add(stockVo.getCurrent());
			oneData.add(stockVo.getComparePrv());
		
			tableModel.addRow(oneData);
		}
		
		tableModel.fireTableDataChanged();
	}
	
	private StockVo collectCompany(String code) {
        StockVo stockVo = null;

        try {
            // 크롤링할 주소
            String url = NAVER_STOCK_URL + code;

            // Jsoup을 사용하여 웹 페이지에 연결
            Document doc = Jsoup.connect(url).get();

            Element companyInfo = doc.select(".wrap_company h2 a").get(0);
            
            String companyName = companyInfo.text();
            
            LOGGER.debug("companyInfo = " + companyInfo);
            LOGGER.debug("companyName = " + companyName);
            
            Element newTotalInfo = doc.select(".new_totalinfo").get(0);
            
            Element blind = newTotalInfo.select(".blind").get(0);
            
            Element dd = blind.select("dd").get(3);
            
            String currentText = dd.text();
            String[] currentWords = currentText.split(" ");
            
            String currentPrice = currentWords[1]; 
       
            String symbol = "";
            if (currentWords[3].equals("하락")) {
            	symbol = "-";
            }
            else if (currentWords[3].equals("상승")) {
            	symbol = "+";
            }
            
            String previous = (symbol + currentWords[4]);
            LOGGER.debug(previous);
            
            stockVo = new StockVo();
            stockVo.setCode(code);
            stockVo.setName(companyName);
            stockVo.setCurrent(currentPrice);
            stockVo.setComparePrv(previous);
            
            LOGGER.debug(stockVo.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }	
        
        return stockVo;
	}
}
