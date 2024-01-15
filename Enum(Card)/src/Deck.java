import java.util.ArrayList;

public class Deck {
    final int NumAllCards = 52;
    ArrayList<Cards> cards;

    public Deck() {
        cards = new ArrayList<>(NumAllCards);
    }

    public void input() {
        Cards.Suit[] suits = Cards.Suit.values();
        Cards.Rank[] ranks = Cards.Rank.values();
        
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Cards(ranks[j], suits[i]));
            }
        }
    }

    public void output() {
        for (int i = 0; i < cards.size(); i++) {
            Cards currentCard = cards.get(i);
            switch (currentCard.getRank()) {
                case Ace:
                    System.out.println("Ace " + currentCard.getSuit());
                    break;
                case Jack:
                    System.out.println("Jack " + currentCard.getSuit());
                    break;
                case Queen:
                    System.out.println("Queen " + currentCard.getSuit());
                    break;
                case King:
                    System.out.println("King " + currentCard.getSuit());
                    break;
                default:
                    System.out.println(currentCard.getRank() + " " + currentCard.getSuit());
            }
        }
    }
}