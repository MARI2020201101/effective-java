package ch12.item87;

import java.io.*;

public class CustomSerializableTesterV2 {
    public static String FILE_NAME = "custom.02";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serialize();
        CustomSerializableV2 deserializedObject = deserialize();
        System.out.println(deserializedObject);

    }

    public static void serialize() throws IOException {

        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos)){

            out.writeObject(new CustomSerializableV2(1, null));
        }
    }
    public static CustomSerializableV2 deserialize() throws IOException, ClassNotFoundException {

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream in = new ObjectInputStream(bis)) {

            CustomSerializableV2 CustomSerializableV2 = (CustomSerializableV2) in.readObject();
            return CustomSerializableV2;
        }
    }
}
