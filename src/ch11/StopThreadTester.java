package ch11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class StopThreadTester {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InterruptedException {
        Thread stopThread = new StopThread(100);
        stopThread.start();
        Method stopMe = stopThread.getClass().getDeclaredMethod("stopMe");
//        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1); //오.. 이거좋네
        stopMe.invoke(null);


    }
}
