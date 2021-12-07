package ch07.item42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTester {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("aaaa");
        words.add("bb");
        words.add("c");
        words.add("dddddd");
        words.add("eee");
        words.add("ff");
        words.sort((s1,s2)-> s1.length() - s2.length());
        words.sort(Comparator.comparingInt(String::length)); //동일한 기능을 제공하고 있다..!!
        //Comparator는 인터페이스이지만 구현해야하는 메서드가 compare 한개뿐으로. functional Interface가 성립한다
        System.out.println(words);
    }
}
