package ch05.item33;

import java.util.List;

public class SuperTypeTokenTester {
    public static void main(String[] args) {
        SuperTypeToken superTypeToken = new SuperTypeToken();

        superTypeToken.putFavoritesWithType(new SuperTypeToken.TypeRef<List<String>>(){},List.of("a","b","c"));
        List<String> favorites1 = superTypeToken.getFavoritesWithType(new SuperTypeToken.TypeRef<List<String>>(){});
        System.out.println(favorites1);


    }
}
