public class Card
{
    public int pointValue;
    public String rank, suit;
    public Card(String r, String s, int p)
    {
        rank = r;
        suit = s;
        pointValue = p;
    }
    public int getPointValue()
    {
        return pointValue;
    }
    public String getRank()
    {
        return rank;
    }
    public String getSuit()
    {
        return suit;
    }
    public static void testCardEquality(Card a, Card b)
    {
        if (a.getPointValue() == b.getPointValue() && (a.getRank()).equals(b.getRank()) && (a.getSuit()).equals(b.getSuit()))
        {
            System.out.println("The given cards are equal.");
        }
        else
        {
            System.out.println("The given cards are not equal.");
        }
    }
    public String toString()
    {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}