import java.util.*;
public class Deck
{
    public String[] ranks, suits;
    public int[] values;
    private int size;
    private ArrayList<Card> deck;
    public Deck(String[] r, String[] s, int[] v)
    {
        ranks = r;
        suits = s;
        values = v;
        deck = new ArrayList<Card>();
        for (int p = 0; p < suits.length; p++)
        {
            for (int i = 0; i < ranks.length; i++)
            {
                deck.add(new Card(ranks[i], suits[p], values[i]));
            }
        }
        size = deck.size();
        shuffle();
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public int size()
    {
        return size;
    }
    public Card deal()
    {
        shuffle();
        size--;
        return deck.get(size);
    }
    public void shuffle()
    {
        for(int k = size - 1; k >= 0; k--)
        {
            int z = (int)(Math.random() * k);
            Card temp = deck.get(z);
            deck.set(z, deck.get(k));
            deck.set(k, temp);
        }
    }
}