package ch09.item60;

public class FloatDoubleTesterV3 {
    public static void main(String[] args) {

        int money = 100;
        int bought = 0;
        for(int price = 10 ; price <=money ; price+=10){
            money-=price;
            bought++;
            System.out.println("price : "+price);
            System.out.println("money : " +money);
        }
        System.out.println("산 물건의 개수 : " +bought); //소수점계산대신 아예 int로 구현....

    }

}
