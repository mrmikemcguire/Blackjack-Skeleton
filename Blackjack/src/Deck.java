import java.util.ArrayList;

public class Deck
	{
	static String currentCard;
	static int currentCardValue;

	static String[] deck = {"ace of diamonds", "king of diamonds", "queen of diamonds", "jack of diamonds", "ten of diamonds", "nine of diamonds", "eight of diamonds", "seven of diamonds",
			"six of diamonds", "five of diamonds", "four of diamonds", "three of diamonds", "two of diamonds", "ace of spades",
			"king of spades", "queen of spades", "jack of spades", "ten of spades", "nine of spades", "eight of spades", "seven of spades", "six of spades",
			"five of spades", "four of spades", "three of spades", "two of spades", "ace of clubs", "king of clubs",
			"queen of clubs", "jack of clubs", "ten of clubs", "nine of clubs", "eight of clubs", "seven of clubs",
			"six of clubs", "five of clubs", "four of clubs", "three of clubs", "two of clubs", "ace of hearts",
			"king of hearts", "queen of hearts", "jack of hearts", "ten of hearts", "nine of hearts", "eight of hearts", "seven of hearts", "six of hearts",
			"five of hearts", "four of hearts", "three of hearts", "two of hearts"};
	
//	public static void shuffle()
//		{
//        for (int i=0; i<100; i++)
//        	{
//            index_1 = generator.nextInt( cards.size() - 1 );
//            index_2 = generator.nextInt( cards.size() - 1 );
//
//            temp = (Card) cards.get( index_2 );
//            cards.set( index_2 , cards.get( index_1 ) );
//            cards.set( index_1, temp );
//        	}
//		}
//    public Card drawFromDeck()
//    	{     
//        return cards.remove( 0 );
//    	}


public static void deal()
		{
		int randomCardDraw = (int) ((Math.random() * 51) + 1);
		Deck.currentCard = deck[randomCardDraw];
		
	if ((currentCard.substring(0,3).equals ("kin")) || (currentCard.substring(0,3).equals ("que")) || 
		(currentCard.substring(0,3).equals ("jac")) || (currentCard.substring(0,3).equals ("ten")))
		{
		currentCardValue = 10;
		}
	if ((currentCard.substring(0,3).equals ("nin")))
		{
		currentCardValue = 9;
		}
	if ((currentCard.substring(0,3).equals ("eig")))
		{
		currentCardValue = 8;
		}
	if ((currentCard.substring(0,3).equals ("sev")))
		{
		currentCardValue = 7;
		}
	if ((currentCard.substring(0,3).equals ("six")))
		{
		currentCardValue = 6;
		}
	if ((currentCard.substring(0,3).equals ("fiv")))
		{
		currentCardValue = 5;
		}
	if ((currentCard.substring(0,3).equals ("fou")))
		{
		currentCardValue = 4;
		}
	if ((currentCard.substring(0,3).equals ("thr")))
		{
		currentCardValue = 3;
		}
	if ((currentCard.substring(0,3).equals ("two")))
		{
		currentCardValue = 2;
		}
	else
		{
//		chooseAceValue();
		}
	}
}
