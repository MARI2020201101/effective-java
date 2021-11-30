package ch02.item9;

import java.io.*;

public class CreateFileV3 {
    public static String SOURCE = "./src/ch02/item9/test.txt";
    public static String DIRECTION = "./src/ch02/item9/test2.txt";

    public static void main(String[] args) {
        createFileExceptionV3();
    }

    //개선 버전 V3. 예외 되던지기를 하지 않아도 스택트레이스에 예외가 전부 먹히지 않고 기록되는 것을 확인할 수 있다!!
    //try - catch - with resources의 위력!! 젤 깔끔!
    public static void createFileExceptionV3()  {
        try(InputStream in = new MyFileInputStream(SOURCE);
            OutputStream out = new FileOutputStream(DIRECTION)){
            byte[] buf = new byte[1024];
            int input;
            while((input = in.read(buf))!=-1){
                out.write(buf,0,input);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}

