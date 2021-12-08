package ch07.item46;

import java.util.ArrayList;
import java.util.List;

public class DeckMaker {

    public static void main(String[] args) {
        List<Card> cardList = newDeck();
        cardList.forEach(System.out::println);
    }
    public static List<Card> newDeck(){
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()){
            for(Suit suit : Suit.values()){
                Card card = new Card(rank,suit);
                cards.add(card);
            }
        }
        return cards;
    }
}

