package ch02.item9;

import java.io.*;

public class CreateFile {
    public static String SOURCE = "./src/ch02/item9/test.txt";
    public static String DIRECTION = "./src/ch02/item9/test2.txt";

    public static void main(String[] args) {
        createFile();
    }

    //일반적인 fileInputStream
    public static void createFile(){
        try(InputStream in = new FileInputStream(SOURCE);
            OutputStream out = new FileOutputStream(DIRECTION)){
            byte[] buf = new byte[1024];
            int input;
            while((input = in.read(buf))!=-1){
                out.write(buf,0,input);
            }
        }catch(IOException e){
            System.out.println("IO Exception 발생!");
        }
    }

}

