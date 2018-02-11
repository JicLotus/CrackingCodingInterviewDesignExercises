
package seven.one;

/*
 * card
 * 	-cardType
 * deck
 * factoryDeck
 * 
 * */


public class One {

	public One() 
	{
	}
	
	
	public void execute() throws Exception 
	{
		Game game = new Game();
		game.initialize();
		
		while(!game.isEnded()) 
		{
			game.printHands();
			game.play();
			game.passTurn();
		}
		
		System.out.print("Game Over.");
		
	}
	
	
}
