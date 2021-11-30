package ch02.item9;

import java.io.*;

public class CreateFileExceptionV2 {
    public static String SOURCE = "./src/ch02/item9/test.txt";
    public static String DIRECTION = "./src/ch02/item9/test2.txt";

    public static void main(String[] args) {
        try{
            createFileExceptionV2();
            //read 할때의 예외는 삼켜지고 있다!!!
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //더티버전 2..
    public static void createFileExceptionV2() throws IOException {
        InputStream in = new MyFileInputStream(SOURCE);
        try {
            OutputStream out = new FileOutputStream(DIRECTION);
            try {
                byte[] buf = new byte[1024];
                int input;
                while ((input = in.read(buf)) != -1) {
                    out.write(buf, 0, input);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}

