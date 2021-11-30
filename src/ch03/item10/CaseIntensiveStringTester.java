package ch03.item10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseIntensiveStringTester {
    public static void main(String[] args) {
        CaseIntensiveString c = new CaseIntensiveString("BlahBlahBlah");
        String s = "blahblahblah";

        System.out.println(c.equals(s));
        System.out.println(s.equals(c));
        //대칭성에 위배되고 있다. equals 재정의 실패!

        System.out.println("---------------------");
        List<CaseIntensiveString> list = new ArrayList<>();
        list.add(c);
        System.out.println(list.contains(s));

    }
}
