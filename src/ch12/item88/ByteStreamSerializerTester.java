package ch12.item88;

import java.io.*;
import java.util.Date;

public class ByteStreamSerializerTester {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Period period = new Period(new Date(), new Date());
        byte[] serializedPeriod = serialize(period);
        Period deserializedPeriod = deserialize(serializedPeriod);

        System.out.println(period);
        System.out.println(deserializedPeriod);
        System.out.println("period == deserializedPeriod : " +(period == deserializedPeriod));
        System.out.println("period.equals(deserializedPeriod) : " +(period.equals(deserializedPeriod)));

        Date end = deserializedPeriod.end();
        end.setTime(11111111);
        System.out.println(deserializedPeriod);

    }

    public static byte[] serialize(Period period) throws IOException {
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(period);
            byte[] byteObject = bos.toByteArray();
            return byteObject;
        }
    }

    public static Period deserialize(byte[] byteObject) throws IOException, ClassNotFoundException {
        try(ByteArrayInputStream bis = new ByteArrayInputStream(byteObject);
            ObjectInputStream in = new ObjectInputStream(bis)){
            Period period = (Period) in.readObject();
            return period;
        }
    }
}
