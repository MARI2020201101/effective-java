package ch02.item2;

import java.io.*;

public class ChocoPotV6Tester {

    public static final String FILE_NAME = "chocopot.serialize.v6";
    public static void main(String[] args) throws Exception {
        ChocolatePotV6 chocolatePotV6 = serializeChocoPot();
        ChocolatePotV6 deserializeChocoPot = deserializeChocoPot();

        System.out.println("---------------------------------------");
        System.out.println("chocolatePotV6==deserializeChocoPot : " + (chocolatePotV6==deserializeChocoPot));
        System.out.println("chocolatePotV6.equals(deserializeChocoPot) : " +(chocolatePotV6.equals(deserializeChocoPot)));

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
