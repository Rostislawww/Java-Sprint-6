import java.util.Arrays;

public class Cards {
    private Rank rank;
    private Suit suit;

    public Cards() {
    }

    public Cards(Rank rank, Suit suit) {
        assert isRankTrue(rank);
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    boolean isRankTrue(Rank value) {
        return Arrays.asList(Rank.values()).contains(value);
    }

    enum Suit {
        Hearts, Spades, Clubs, Diamonds
    }

    enum Rank {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    boolean isSuitTrue(Suit value) {
        return Arrays.asList(Suit.values()).contains(value);
    }
}
