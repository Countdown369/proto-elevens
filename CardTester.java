public class CardTester
{
    public static void main(String[] args)
    {
        Card queen = new Card("Queen", "Hearts", 12);
        Card ace = new Card("Ace", "Spades", 14);
        Card ace2 = new Card("Ace", "Spades", 14);
        Card.testCardEquality(queen, ace);
        Card.testCardEquality(ace2, ace);
        System.out.println(queen.toString());
    }
}