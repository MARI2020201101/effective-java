package ch09.item60;

public class FloatDoubleTester {
    public static void main(String[] args) {
        System.out.println(1.03 - 0.42);
        System.out.println(1.00 - 9*0.1);//근사치를 반환하기 때문에 정확하지 않다.

        System.out.println("------------------");
        double money = 1.00;
        int bought = 0;
        for(double price = 0.1 ; price <=money ; price+=0.1){
            money-=price;
            bought++;
            System.out.println("price : "+price);
            System.out.println("money : " +money);
        }
        System.out.println("산 물건의 개수 : " +bought); //4가 아니라 3이다!!

    }

}
