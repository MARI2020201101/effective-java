package ch05.item33;

import java.util.List;

public class FavoritesTester {
    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavorites(String.class,"java");
        favorites.putFavorites(Integer.class,1);
        favorites.putFavorites(Class.class, Favorites.class);

        String favorites1 = favorites.getFavorites(String.class);
        Integer favorites2 = favorites.getFavorites(Integer.class);
        Class favorites3 = favorites.getFavorites(Class.class);
        System.out.printf("%s , %d , %s\n", favorites1,favorites2,favorites3.toString());

        FavoritesV2 favorites4 = new FavoritesV2();
        favorites4.putFavorites(String.class,"java");
        favorites4.putFavorites(Integer.class,1);
        favorites4.putFavorites(Class.class, FavoritesV2.class);

        String favorites5 = favorites4.getFavorites(String.class);
        Integer favorites6 = favorites4.getFavorites(Integer.class);
        Class favorites7 = favorites4.getFavorites(Class.class);
        System.out.printf("%s , %d , %s\n", favorites5,favorites6,favorites7.toString());


        FavoritesV2 favoritesV2 = new FavoritesV2();
        favoritesV2.putFavorites(List.class, List.of(1,2,3));
//        favoritesV2.putFavorites(List<String>.class , List.of("a","b","c"));
        //클래스 리터럴을 사용할수가 없다... 자바의 하위호환성을 위한 몸부림때문에 ㅜㅜ        List favorites8 = favoritesV2.getFavorites(List.class);
        System.out.println(favorites8);
    }
}
