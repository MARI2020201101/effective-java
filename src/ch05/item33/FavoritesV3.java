package ch05.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FavoritesV3 {

    private Map<Class<?>,Object> map = new HashMap<>();

    public <T> void putFavorites(Class<T> clazz, T value){
        map.put(Objects.requireNonNull(clazz),clazz.cast(value));
        //혹시 타입이 다른 객체를 넣는 것을 방지한다!
    }
    public <T> T getFavorites(Class<T> clazz){
        return clazz.cast(map.get(clazz));
    }
}
