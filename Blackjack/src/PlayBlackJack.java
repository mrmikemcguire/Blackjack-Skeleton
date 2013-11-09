
public class PlayBlackJack
	{
	static int playerHandValue = 0;
	static int dealerHandValue = 0;
	
	public static void main(String[] args)
		{
		Deck.populateDeck();
		Deck.shuffle();
		
		while(true)
			{
			Deck.deal();
			Deck.deck.remove(0);
			System.out.println("You were dealt the " + Deck.currentCard );
			System.out.println("It is worth " + Deck.currentCardValue + " points");
			playerHandValue = playerHandValue + Deck.currentCardValue;
			System.out.println("Your hand is worth " + playerHandValue + " points");
			if (playerHandValue > 21)
				{
				System.out.println();
				System.out.println("You're busted!");
				System.exit(0);
				}
			Deck.deal();
			System.out.println("The dealer draws the " + Deck.currentCard );
			dealerHandValue = dealerHandValue + Deck.currentCardValue;
			System.out.println("The dealer's hand is worth " + dealerHandValue + " points");
			if (dealerHandValue > 21)
				{
				System.out.println();
				System.out.println("You win. The dealer is busted!");
				System.exit(0);
				}
			System.out.println();
			}
		}
	
//	public static boolean checkForBust()
//		{
//		if (playerHandValue > 21)
//			{
//			System.out.println("You're busted!");
//			System.exit(0);
//			}
//		if (dealerHandValue > 21)
//			{
//			System.out.println("You win. The dealer is busted!");
//			System.exit(0);
//			}
//		else
//			{
//			return true;
//			}
//		return false;
//		}


	}
