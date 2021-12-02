package ch03.item14;

import ch03.item10.CaseIntensiveString;
import ch03.item13.PhoneNumber;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class ComparatorTester {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(11,1,2);
        PhoneNumber phoneNumber2 = new PhoneNumber(11,1,3);
        Comparator<PhoneNumber> comparator =
                comparingInt((PhoneNumber p) -> p.getNum1())
                .thenComparingInt(p-> p.getNum2())
                        .thenComparingInt(p -> p.getNum3());

        int compare = comparator.compare(phoneNumber, phoneNumber2);
        System.out.println(compare);

        CaseIntensiveString c1 = new CaseIntensiveString("Hello");
        CaseIntensiveString c2 = new CaseIntensiveString("Halloween");
        Comparator<String> comparator2 = (o1,o2) ->
                String.CASE_INSENSITIVE_ORDER.compare((String) o1, (String) o2);

        int compare1 = comparator2.compare(c1.getS(), c2.getS());
        System.out.println(compare1);


    }


    public static int compareCaseIntensiveString(String c1, String c2){
        return String.CASE_INSENSITIVE_ORDER.compare(c1,c2);
    }
}
