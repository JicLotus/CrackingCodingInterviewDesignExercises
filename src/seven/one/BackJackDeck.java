package seven.one;

public abstract class BackJackDeck extends Deck {
	
	private int handLimit = 5;
	
	public BackJackDeck()
	{
		super();
	}
	
	/*First 5 cards of deck*/
	public Card[] getHand() throws Exception 
	{
		Card[] hand = new Card[handLimit];
		
		if (cards.length<5) 
		{
			throw new Exception("The exception");
		}
		
		for(int i =0 ;i<5;i++) 
		{
			Card tempCard = cards[i];
			
			if (tempCard.isUsed()) 
			{
				hand[i] = cards[i];
				tempCard.useCard();
			}
		}
		
		return hand;
	}
	
	public Card getCard()
	{
		return  cards[0];
	}

}
