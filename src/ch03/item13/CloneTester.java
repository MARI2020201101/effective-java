package ch03.item13;

public class CloneTester {
    public static void main(String[] args)  {
        PhoneNumber p1 = new PhoneNumber(1,2,3);
        PhoneNumber p2 = p1.clone();
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}
