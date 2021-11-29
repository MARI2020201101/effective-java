package ch02.item2;

import java.io.*;

public class EnumChocoPotTester {

    public static final String FILE_NAME = "chocopot.serialize.enum";
    public static void main(String[] args) {
        ChocolatePotV4.CHOCOLATE_POT_V4.printName();
    }

    public static ChocolatePotV6 serializeChocoPot() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(ChocolatePotV6.INSTANCE);

        out.close();
        bos.close();
        fos.close();

        return ChocolatePotV6.INSTANCE;
    }
    public static ChocolatePotV6 deserializeChocoPot() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);
        ChocolatePotV6 chocolatePotV6 =(ChocolatePotV6) in.readObject();


        in.close();
        bis.close();
        fis.close();

        return chocolatePotV6;
    }
}
