package ch08.item50;

import java.util.Date;

public class DateSub extends Date {

    private Date original;
    @Override
    public Date clone() {
        Date clone = (Date) super.clone();
        original = clone;
        original.setTime(1324239439);
        return original;
    }
}
