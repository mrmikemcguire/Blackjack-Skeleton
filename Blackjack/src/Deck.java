import java.util.ArrayList;
import java.util.Collections;


public class Deck
	{
	static String currentCard;
	static int currentCardValue;
	static ArrayList<String> deck = new ArrayList<String>();

	static String[] listOfCards = {"ace of diamonds", "king of diamonds", "queen of diamonds", "jack of diamonds", "ten of diamonds", "nine of diamonds", "eight of diamonds", "seven of diamonds",
			"six of diamonds", "five of diamonds", "four of diamonds", "three of diamonds", "two of diamonds", "ace of spades",
			"king of spades", "queen of spades", "jack of spades", "ten of spades", "nine of spades", "eight of spades", "seven of spades", "six of spades",
			"five of spades", "four of spades", "three of spades", "two of spades", "ace of clubs", "king of clubs",
			"queen of clubs", "jack of clubs", "ten of clubs", "nine of clubs", "eight of clubs", "seven of clubs",
			"six of clubs", "five of clubs", "four of clubs", "three of clubs", "two of clubs", "ace of hearts",
			"king of hearts", "queen of hearts", "jack of hearts", "ten of hearts", "nine of hearts", "eight of hearts", "seven of hearts", "six of hearts",
			"five of hearts", "four of hearts", "three of hearts", "two of hearts"};
	
	public static void populateDeck()
		{
		for(int i=0;i<52;i++)
			{
			deck.add(listOfCards[i]);
			}
		}
	
	public static void shuffle()
		{
		Collections.shuffle(deck);	
		}
	
public static void deal()
		{
		currentCard = deck.get(0);
		
		switch (currentCard.substring(0,3))
			{
			case "ace":
				{
				currentCardValue = 11;
				break;
				}
			case "kin":
			case "que":
			case "jac":
			case "ten":
				{
				currentCardValue = 10;
				break;
				}
			case "nin":
				{
				currentCardValue = 9;
				break;
				}
			case "eig":
				{
				currentCardValue = 8;
				break;
				}
			case "sev":
				{
				currentCardValue = 7;
				break;
				}
			case "six":
				{
				currentCardValue = 6;
				break;
				}
			case "fiv":
				{
				currentCardValue = 5;
				break;
				}
			case "fou":
				{
				currentCardValue = 4;
				break;
				}
			case "thr":
				{
				currentCardValue = 3;
				break;
				}
			case "two":
				{
				currentCardValue = 2;
				break;
				}		
			}
		
//	if ((currentCard.substring(0,3).equals ("kin")) || (currentCard.substring(0,3).equals ("que")) || 
//		(currentCard.substring(0,3).equals ("jac")) || (currentCard.substring(0,3).equals ("ten")))
//		{
//		currentCardValue = 10;
//		}
//	if ((currentCard.substring(0,3).equals ("nin")))
//		{
//		currentCardValue = 9;
//		}
//	if ((currentCard.substring(0,3).equals ("eig")))
//		{
//		currentCardValue = 8;
//		}
//	if ((currentCard.substring(0,3).equals ("sev")))
//		{
//		currentCardValue = 7;
//		}
//	if ((currentCard.substring(0,3).equals ("six")))
//		{
//		currentCardValue = 6;
//		}
//	if ((currentCard.substring(0,3).equals ("fiv")))
//		{
//		currentCardValue = 5;
//		}
//	if ((currentCard.substring(0,3).equals ("fou")))
//		{
//		currentCardValue = 4;
//		}
//	if ((currentCard.substring(0,3).equals ("thr")))
//		{
//		currentCardValue = 3;
//		}
//	if ((currentCard.substring(0,3).equals ("two")))
//		{
//		currentCardValue = 2;
//		}
//	if ((currentCard.substring(0,3).equals ("ace")))
//		{
//		currentCardValue = 11;
//		}
//	
	deck.remove(0);
	}
}
