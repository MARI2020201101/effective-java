package ch12.item87;

import java.io.*;
import java.util.List;

import static ch12.item87.CustomSerializable.*;

public class CustomSerializableTester {
    public static String FILE_NAME = "custom.01";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serialize();
        deserialize();

    }

    public static void serialize() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(new CustomSerializable(1, List.of(Versions.values())));

        out.close();
        bos.close();
        fos.close();

    }
    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);
        CustomSerializable customSerializable = (CustomSerializable) in.readObject();


        in.close();
        bis.close();
        fis.close();

    }
}
