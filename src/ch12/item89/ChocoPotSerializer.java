package ch12.item89;

import java.io.*;

public class ChocoPotSerializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        byte[] serializedChocoPot = serialize(ChocolatePot.INSTANCE);
        ChocolatePotStealer stealer = new ChocolatePotStealer();
        ChocolatePot chocolatePot = stealer.chocolatePot;

        ChocolatePot deserialize = deserialize(serializedChocoPot);
        deserialize.print();
        chocolatePot.print();

    }

    public static byte[] serialize(ChocolatePot chocolatePot) throws IOException {
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(chocolatePot);
            byte[] byteObject = bos.toByteArray();
            return byteObject;
        }
    }

    public static ChocolatePot deserialize(byte[] byteObject) throws IOException, ClassNotFoundException {
        try(ByteArrayInputStream bis = new ByteArrayInputStream(byteObject);
            ObjectInputStream in = new ObjectInputStream(bis)){
            ChocolatePot chocolatePot = (ChocolatePot) in.readObject();
            return chocolatePot;
        }
    }
}
