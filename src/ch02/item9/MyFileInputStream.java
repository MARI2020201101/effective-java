package ch02.item9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream extends FileInputStream {
    public MyFileInputStream(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public int read(byte[] b) throws IOException {
        throw new IOException("데이터 읽기도중 Exception 발생!!");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("자원 닫는도중 Exception 발생!!");
    }
}
