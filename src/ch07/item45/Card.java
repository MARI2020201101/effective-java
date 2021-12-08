package ch07.item45;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card { " +
                "rank=" + rank +
                " , suit=" + suit +
                " } ";
    }
}
