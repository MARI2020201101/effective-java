package ch02.item9;

import java.io.*;

public class CreateFileException {
    public static String SOURCE = "./src/ch02/item9/test.txt";
    public static String DIRECTION = "./src/ch02/item9/test2.txt";

    public static void main(String[] args) {
        createFileException();
        //예외가 삼켜지지는 않으나 몹시 더티함!!
    }

    //더티버전 1...
    public static void createFileException() {
        InputStream in = null;
        OutputStream out = null;
        try{
            in = new MyFileInputStream(SOURCE);
            out = new FileOutputStream(DIRECTION);
            byte[] buf = new byte[1024];
            int input;
            while((input = in.read(buf))!=-1){
                out.write(buf,0,input);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

}

