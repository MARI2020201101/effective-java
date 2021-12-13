package ch12.item88;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class ByteStreamSerializerTesterV2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Period period = new Period(new Date(), new Date());
        byte[] serializedPeriod = serialize(period);
        Period deserializedPeriod = deserialize(serializedPeriod);

        System.out.println(Arrays.toString(serializedPeriod));//바이트 이므로 -128~127사이의 값
        //결국 이 값을 조작하면 불변식을 깨뜨릴수있게된다는거!
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
