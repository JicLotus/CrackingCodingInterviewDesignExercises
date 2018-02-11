package seven.one;

public abstract class Deck {
	
	protected Card[] cards;
	
	public void shuffle() 
	{
		
	}
	
	public abstract Card[] getHand() throws Exception;
	public abstract Card getCard();
}
