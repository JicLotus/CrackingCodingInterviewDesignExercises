package seven.one;

public class Player {
	
	private Card[] hand;
	private int points;
	
	public int getPoints() 
	{
		return points;
	}
	
	public void setHand(Card[] _hand) 
	{
		hand = _hand;
	}
	
	public void takeDecition() 
	{
		
	}
	
	public void setCard(Card card) 
	{
	}
	
	public void printHand() 
	{
		for(Card card : hand) 
		{
			System.out.print(card + "-");
		}
	}
	
	
}
