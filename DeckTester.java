public class DeckTester
{
    public static String[] deckofcardsranks = {"5", "6", "7", "8"};
    public static String[] deckofcardssuits = {"Diamonds", "Clubs", "Spades", "Hearts"};
    public static int[] deckofcardsvalues = {5, 6, 7, 8};
    public static void main(String[] args)
    {
        Deck deckofcards = new Deck(deckofcardsranks, deckofcardssuits, deckofcardsvalues);
        System.out.println(deckofcards.isEmpty());
        System.out.println(deckofcards.size());
        System.out.println((deckofcards.deal()).toString());
    }
}