package ch07.item45;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeckMakerV2 {

    public static void main(String[] args) {
        List<Card> cardList = newDeck();
        cardList.forEach(System.out::println);
    }
    public static List<Card> newDeck(){
        return Stream.of(Rank.values())
                .flatMap(rank -> Stream.of(Suit.values())
                        .map(suit -> new Card(rank,suit)))
                .collect(Collectors.toList());
    }
}

