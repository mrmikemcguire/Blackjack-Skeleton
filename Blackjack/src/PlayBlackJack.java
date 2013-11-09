
public class PlayBlackJack
	{
	static int playerHandValue;
	static int dealerHandValue;
	public static void main(String[] args)
		{
		Deck.deal();
		System.out.println("You were dealt the " + Deck.currentCard );
		System.out.println("It is worth " + Deck.currentCardValue + " points");
		playerHandValue = Deck.currentCardValue;
		System.out.println("Your hand is worth " + playerHandValue + " points");
		Deck.deal();
		System.out.println("The dealer draws the " + Deck.currentCard );
		dealerHandValue = Deck.currentCardValue;
		System.out.println("The dealer's hand is worth " + playerHandValue + " points");
		
		Deck.deal();
		System.out.println("You were dealt the " + Deck.currentCard );
		System.out.println("It is worth " + Deck.currentCardValue + " points");
		playerHandValue = playerHandValue + Deck.currentCardValue;
		System.out.println("Your hand is worth " + playerHandValue + " points");
		Deck.deal();
		System.out.println("The dealer draws the " + Deck.currentCard );
		dealerHandValue = dealerHandValue + Deck.currentCardValue;
		System.out.println("The dealer's hand is worth " + playerHandValue + " points");

		}
	
	public static boolean checkForBust()
		{
		if (playerHandValue > 21)
			{
			System.out.println("You're busted!");
			}
		if (dealerHandValue > 21)
			{
			System.out.println("You win. The dealer is busted!");
			}
		else
			{
			return true;
			}
		return false;
		}


	}
