package ocjp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScoreTest {
	private static Logger LOGGER = LoggerFactory.getLogger(ScoreTest.class);
	
	public static void main(String[] args) {
		Score score = new Score(10, 8);
		Score score1 = new Score(10, 9);
		
		int result = score1.compareTo(score);
		LOGGER.debug(String.format("result=%d", result));
		
		List<Score> scoreList = new ArrayList<>();
		scoreList.add(score);
		scoreList.add(score1);
		scoreList.add(new Score(22, 10));
		scoreList.add(new Score(11, 90));
		scoreList.add(new Score(22, 19));
	
		Score[] scoreArr = new Score[scoreList.size()];
		scoreList.toArray(scoreArr);
		
		Arrays.sort(scoreArr);
		
		for (Score oneScore : scoreArr) {
			LOGGER.debug("oneScore = " + oneScore);
		}
	}
}
