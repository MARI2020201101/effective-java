package ch03.item10;

import java.util.ArrayList;
import java.util.List;

public class CaseIntensiveStringTesterV2 {
    public static void main(String[] args) {
        CaseIntensiveStringV2 c = new CaseIntensiveStringV2("BlahBlahBlah");
        String s = "blahblahblah";

        System.out.println(c.equals(s));
        System.out.println(s.equals(c));


        System.out.println("--------------");
        List<CaseIntensiveStringV2> list = new ArrayList<>();
        list.add(c);
        System.out.println(list.contains(s));
        System.out.println("--------------");

        CaseIntensiveStringV2 c2 = new CaseIntensiveStringV2("blaHBlahBlaH");
        System.out.println(c2.equals(c));
        System.out.println(c.equals(c2));

    }
}
