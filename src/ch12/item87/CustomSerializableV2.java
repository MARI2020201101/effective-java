package ch12.item87;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class CustomSerializableV2 implements Serializable {
    private int number;
    private List<Versions> versions;

    public CustomSerializableV2(int number , List<Versions> versions){
        this.number = number;
        this.versions = versions;
    }

    public static enum Versions {
        V1,V2,V3
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        System.out.println("writeObject");
        s.writeUTF("hello im customed serializable");
        for(Versions v : Versions.values()){
            s.writeObject(v);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        System.out.println("readObject");
        String s1 = s.readUTF();
        System.out.println(s1);
        Object o = s.readObject();
        if(o instanceof List){
            System.out.println(o);
        }
    }

    @Override
    public String toString() {
        return "CustomSerializableV2{" +
                "number=" + number +
                ", versions=" + versions +
                '}';
    }
}
