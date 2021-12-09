package ch09.item60;

import java.math.BigDecimal;

public class FloatDoubleTesterV2 {
    public static void main(String[] args) {

        BigDecimal money = new BigDecimal("1.00");
        BigDecimal TEN_CENTS = new BigDecimal(".10");
        int bought = 0;
        for(BigDecimal price = TEN_CENTS ; money.compareTo(price)>=0 ; price=price.add(TEN_CENTS)){
            money = money.subtract(price);
            bought++;
            System.out.println("price : "+price);
            System.out.println("money : " +money);
        }
        System.out.println("산 물건의 개수 : " +bought); //이제 4개가 정확하게 나온다!!

    }

}
