package homework.pokerHomework2;

import java.util.Set;

public interface CardInterface {
	public void clear();
	public Set<CardVo> getCards(int cardNum) throws Exception;
}
