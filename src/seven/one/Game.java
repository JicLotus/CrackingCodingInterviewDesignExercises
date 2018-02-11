package seven.one;

public class Game {

	private Deck deck;
	private Player[] players;
	private int actualIndexPlayer=0;
	private int finalGameScore = 21;
	
	public Game() 
	{
		
	}
	
	public void initialize() throws Exception
	{
		deck.shuffle();
		
		for(Player player : players) {
			player.setHand(deck.getHand());
		}
	}
	
	public boolean isEnded() 
	{
		return anyPlayerHasEnoughtPoints();
	}
	
	private boolean anyPlayerHasEnoughtPoints() 
	{
		for(Player player : players) 
		{
			if (player.getPoints()==finalGameScore)
			{
				return true;
			}
		}
		return false;
	}
	
	public void passTurn() 
	{
		actualIndexPlayer++;
		players[actualIndexPlayer].setCard(deck.getCard());
	}
	
	public void printHands() 
	{
		for(Player player : players)
		{
			player.printHand();
		}
	}
	
	public void play() 
	{
		players[actualIndexPlayer].takeDecition();
	}
	
	
}
