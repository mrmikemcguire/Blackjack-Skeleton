
public class BlackJack
	{
	static int playerHandValue1 = 0;
	static int dealerHandValue1 = 0;
	static int currentCardValue = 0;
	static int playerHandValue = 0;
	static int dealerHandValue = 0;
	
	public static void main(String[] args)
		{
		Deck.fillDeck();
		Deck.shuffle();
		
		while(true)
			{
			currentCardValue = Deck.deck.get(0).getValue();
			System.out.println("You were dealt the " + Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
			System.out.println("It is worth " + Deck.deck.get(0).getValue() + " points");
			Deck.deck.remove(0);
			playerHandValue1 = playerHandValue1 + currentCardValue;
			System.out.println("Your hand is worth " + playerHandValue1 + " points");
			if (playerHandValue1 > 21)
				{
				System.out.println();
				System.out.println("You're busted!");
				System.exit(0);
				}
			currentCardValue = Deck.deck.get(0).getValue();
			System.out.println("The dealer draws the " + Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
			System.out.println("It is worth " + Deck.deck.get(0).getValue() + " points");
			dealerHandValue1 = dealerHandValue1 + currentCardValue;
			System.out.println("The dealer's hand is worth " + dealerHandValue1 + " points");
			if (dealerHandValue1 > 21)
				{
				System.out.println();
				System.out.println("You win. The dealer is busted!");
				System.exit(0);
				}
			System.out.println();
			}
		}
	}
