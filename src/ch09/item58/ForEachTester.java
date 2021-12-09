package ch09.item58;

import ch07.item45.Card;
import ch07.item45.Rank;
import ch07.item45.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachTester {
    public static void main(String[] args) {
        Iterator<Suit> it1 = Arrays.stream(Suit.values()).iterator();
        Iterator<Rank> it2 = Arrays.stream(Rank.values()).iterator();

        List<Card> cardList = new ArrayList<>();
        while(it1.hasNext()){
            while(it2.hasNext()){
                Card card = new Card(it2.next(),it1.next());
                // 4*13 씩 따로따로 불려야하는데!! 13 * 13 불려서 예외학 발생한다
                cardList.add(card);
            }
        }
        System.out.println(cardList);
    }
}
