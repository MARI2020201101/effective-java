package ch02.item7;

import ch02.item5.ChocoSupplier;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapTester {
    public static void main(String[] args) throws InterruptedException {

        ChocoSupplier chocoSupplier = new ChocoSupplier();
        HashMap<Object,Object> hashMap = new HashMap<>();
        hashMap.put(chocoSupplier, "chocoSupplier");
        System.out.println(hashMap);
        chocoSupplier = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(hashMap);
        System.out.println("------------------------------------------");

        ChocoSupplier chocoSupplier2 = new ChocoSupplier();
        WeakHashMap<Object,Object> hashMap2 = new WeakHashMap<>();
        hashMap2.put(chocoSupplier2, "chocoSupplier2"); //만약에 value로 가지고있으면 여전히 Null 객체를 참조로 가지게 된다..
        System.out.println(hashMap2);
        chocoSupplier2 = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(hashMap2);
    }
}
