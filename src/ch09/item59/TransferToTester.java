package ch09.item59;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TransferToTester {
    public static void main(String[] args) throws IOException {
        try(InputStream in = new URL(args[0]).openStream()){
            in.transferTo(System.out); //오오오오.....신기하다......
            //src에서 -> destination으로 transferTo 해준다! fileCopy 시에도 유용!! 
        }
    }
}
