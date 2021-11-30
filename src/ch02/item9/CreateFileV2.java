package ch02.item9;

import java.io.*;

public class CreateFileV2 {
    public static String SOURCE = "./src/ch02/item9/test.txt";
    public static String DIRECTION = "./src/ch02/item9/test2.txt";

    public static void main(String[] args) {
        try{
            createFileExceptionV2();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("main에서 캐치!");
        }
    }

    //개선 버전 V2 + 예외 되던지기 기법을 사용해본다!!
    public static void createFileExceptionV2() throws IOException {
        try(InputStream in = new MyFileInputStream(SOURCE);
            OutputStream out = new FileOutputStream(DIRECTION)){
            byte[] buf = new byte[1024];
            int input;
            while((input = in.read(buf))!=-1){
                out.write(buf,0,input);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("메소드에서 캐치! 되던지기!");
            throw e;
        }
    }

}

