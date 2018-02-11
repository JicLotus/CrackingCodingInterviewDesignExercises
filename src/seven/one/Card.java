package seven.one;

public class Card {
	
	private int number;
	private CardType type;
	private boolean isUsed = false; 
	
	public Card(int _number) 
	{
		this.number = _number;
	}
	
	public void useCard() 
	{
		isUsed=true;
	}
	
	public boolean isUsed() 
	{
		return isUsed;
	}
	
	public int getNumber()
	{
		return number;
	}
}
