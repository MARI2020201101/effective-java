package ch11;

import java.util.concurrent.TimeUnit;

public class StopThreadV2 {
    private static boolean stopRequest;
    private static int count =0;

    public static void main(String[] args) throws InterruptedException {
        Thread backGroundThread = new Thread(()->{

            while(!stopRequest){
                System.out.println("Can you stop me? " + (count++));
            }
            if(stopRequest){
                System.out.println("******* stop requested.... *********");
            }
        });

        backGroundThread.start();
        TimeUnit.SECONDS.sleep(1);

        stopRequest = true; //잘만되는디요? 뭐요?
    }
}
