package swing01;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame {
	private TestPanel jPanel_Main = new TestPanel();
	
	public TestFrame() {
		initComponent();
	}
	
	private void initComponent() {
		this.setContentPane(jPanel_Main);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("종료 버튼 누름");
				// 자바 프로세스 종료
				System.exit(0);
			}
		});
	}
}
