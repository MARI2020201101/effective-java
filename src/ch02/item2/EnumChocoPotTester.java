package ch02.item2;

import java.io.*;

public class EnumChocoPotTester {

    public static final String FILE_NAME = "chocopot.serialize.enum";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ChocolatePotV4.CHOCOLATE_POT_V4.printName();
        ChocolatePotV4 chocolatePotV4 = serializeChocoPot();
        ChocolatePotV4 deserializeChocoPot = deserializeChocoPot();

        System.out.println("---------------------------------------");
        System.out.println("ChocolatePotV4==deserializeChocoPot : " + (chocolatePotV4==deserializeChocoPot));
        System.out.println("ChocolatePotV4.equals(deserializeChocoPot) : " +(chocolatePotV4.equals(deserializeChocoPot)));
    }

    public static ChocolatePotV4 serializeChocoPot() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(ChocolatePotV4.CHOCOLATE_POT_V4);

        out.close();
        bos.close();
        fos.close();

        return ChocolatePotV4.CHOCOLATE_POT_V4;
    }
    public static ChocolatePotV4 deserializeChocoPot() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);
        ChocolatePotV4 chocolatePotV4 =(ChocolatePotV4) in.readObject();


        in.close();
        bis.close();
        fis.close();

        return chocolatePotV4;
    }
}
