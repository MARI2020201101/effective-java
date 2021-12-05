package ch05.item33;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

    private Map<Class<?>,Object> map = new HashMap<>();

    public <T> void putFavorites(Class<T> clazz, T value){
        map.put(clazz,value);
    }
    public <T> T getFavorites(Class<T> clazz){
        return (T)map.get(clazz);
    }
}
