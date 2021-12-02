package ch04.item16;

public class RedBeanBaguetteTester {
    public static void main(String[] args) {
        RedBeanBaguette.RedBean redBean = new RedBeanBaguette().new RedBean();
        System.out.println(redBean.name);
        RedBeanBaguette.Cream cream = new RedBeanBaguette.Cream();
        System.out.println(cream.name);

    }
}
