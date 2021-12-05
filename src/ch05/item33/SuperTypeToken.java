package ch05.item33;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SuperTypeToken {

    private static Map<TypeRef<?>,Object> typeMap = new HashMap<>();

    public <T> void putFavoritesWithType(TypeRef<T> type, T value){
        typeMap.put(type, value);
    }
    public <T> T getFavoritesWithType(TypeRef<T> type){
        return (T)typeMap.get(type.get(type));
    }

    public static class TypeRef<T>{
        private T type;

        public TypeRef() {
            Type sType = getClass().getGenericSuperclass();
            System.out.println(sType);
            if (sType instanceof ParameterizedType) {
                this.type = (T) ((ParameterizedType)sType).getActualTypeArguments()[0];
            } else {
                this.type = (T) sType;
            }
        }
        private <T> T get(TypeRef<T> type) {
            if (type.type instanceof  Class<?>)
                return (T)typeMap.get(type.type);
            else
                return(T) typeMap.get(((ParameterizedType)type.type).getRawType());
        }
    }


}
