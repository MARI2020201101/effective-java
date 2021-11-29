package ch02.item2;

import java.io.*;

public class ChocoPotV5Tester {

    public static final String FILE_NAME = "chocopot.serialize";
    public static void main(String[] args) throws Exception {
        ChocolatePotV5 chocolatePotV5 = serializeChocoPot();
        ChocolatePotV5 deserializeChocoPot = deserializeChocoPot();

        System.out.println("---------------------------------------");
        System.out.println("chocolatePotV5==deserializeChocoPot : " + (chocolatePotV5==deserializeChocoPot));
        System.out.println("chocolatePotV5.equals(deserializeChocoPot) : " +(chocolatePotV5.equals(deserializeChocoPot)));

    }

    public static ChocolatePotV5 serializeChocoPot() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(ChocolatePotV5.INSTANCE);
        System.out.println("ChocolatePot V5 :" + ChocolatePotV5.INSTANCE.hashCode());


        out.close();
        bos.close();
        fos.close();

        return ChocolatePotV5.INSTANCE;
    }
    public static ChocolatePotV5 deserializeChocoPot() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);
        ChocolatePotV5 chocolatePotV5 =(ChocolatePotV5) in.readObject();
        System.out.println("ChocolatePot V5 :" + chocolatePotV5.hashCode());

        in.close();
        bis.close();
        fis.close();

        return chocolatePotV5;
    }

}
