package ch02.item6;

public class BooleanConstructorTesterV2 {
    public static void main(String[] args) {
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(true);
        System.out.println("b3.equals(b4) : " + b3.equals(b4));

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        System.out.println("b1.equals(b2) : " + b1.equals(b2));
        System.out.println("b2.equals(b4) : " + b2.equals(b4));//머야....다똑같네...
    }

}
