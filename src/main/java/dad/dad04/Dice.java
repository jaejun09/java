package dad.dad04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dice {
	private static Logger LOGGER = LoggerFactory.getLogger(Dice.class);
	
	public static void main(String[] args) {
		
		int myWin = 0;
		int yourWin = 0;
		int tie = 0;
		int rollNum = 1000;
		for (int i = 0; i < rollNum; i++) {
			int myDice = (int)(Math.random() * 6) + 1;
			int yourDice = (int)(Math.random() * 6) + 1;
			
			if (myDice > yourDice) {
//				LOGGER.debug(String.format("myDice 승, 값은 %d : %d", myDice, yourDice));
				myWin++;
			}
			else if (myDice == yourDice) {
//				LOGGER.debug(String.format("비겼습니다, 값은 %d : %d", myDice, yourDice));
				tie++;
			}
			else {
//				LOGGER.debug(String.format("yourDice 승, 값은 %d : %d", myDice, yourDice));
				yourWin++;
			}
		}
		LOGGER.debug(String.format("내가 이긴 횟수 : %d(%.2f), 비긴 횟수 : %d(%.2f), 진 횟수 : %d(%.2f)", 
				myWin, ((double)myWin / rollNum) * 100,
				tie, ((double)tie / rollNum) * 100,
				yourWin, ((double)yourWin/ rollNum) * 100));
		
	}
}
