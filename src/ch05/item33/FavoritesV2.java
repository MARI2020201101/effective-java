package ch05.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FavoritesV2 {

    private Map<Class<?>,Object> map = new HashMap<>();

    public <T> void putFavorites(Class<T> clazz, T value){
        map.put(Objects.requireNonNull(clazz),value);
    }
    public <T> T getFavorites(Class<T> clazz){
        return clazz.cast(map.get(clazz));
    }
}
