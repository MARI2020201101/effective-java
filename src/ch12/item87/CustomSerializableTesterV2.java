package ch12.item87;

import java.io.*;
import java.util.List;

import static ch12.item87.CustomSerializable.Versions;

public class CustomSerializableTesterV2 {
    public static String FILE_NAME = "custom.02";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serialize();
        CustomSerializable deserializedObject = deserialize();
        System.out.println(deserializedObject);

    }

    public static void serialize() throws IOException {

        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos)){

            out.writeObject(new CustomSerializable(1, List.of(Versions.values())));
        }
    }
    public static CustomSerializable deserialize() throws IOException, ClassNotFoundException {

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream in = new ObjectInputStream(bis)) {

            CustomSerializable customSerializable = (CustomSerializable) in.readObject();
            return customSerializable;
        }
    }
}
