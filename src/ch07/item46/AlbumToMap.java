package ch07.item46;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class AlbumToMap {

    public static void main(String[] args) {
        List<Album> albums1 = newAlbums();
        List<Album> albums2 = newAlbums();
        List<Album> albums3 = newAlbums();

        albums1.addAll(albums2);
        albums1.addAll(albums3);

        System.out.println(albums1);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        Map<Artist, Album> albumMap = albums1.stream()
                .collect(
                        toMap( Album::getArtist, //key
                                album -> album,  //value
                                BinaryOperator.maxBy(comparingInt(Album::getSales)))
                                // key가 충돌하는 경우 value맵핑기준
        );
        System.out.println(albumMap);

    }

    public static List<Album> newAlbums(){
        return Stream.of(Artist.values())
                .map(artist -> new Album(artist, new Random().nextInt(1000)))
                .collect(toList());
    }
}
