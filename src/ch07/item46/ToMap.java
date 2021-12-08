package ch07.item46;

import ch07.item45.Rank;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMap {
    public static void main(String[] args) {
        Map<Integer, Rank> rankMap = Stream.of(Rank.values())
                .collect(Collectors.toMap(rank -> rank.ordinal(), rank -> rank));
        System.out.println(rankMap);
    }
}
