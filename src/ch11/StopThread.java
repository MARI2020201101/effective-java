package ch11;

public class StopThread extends Thread{

    private boolean stopMe;
    private int n;
    public StopThread(int n){
        this.n=n;
        this.stopMe=false;
    }

    public void stopMe(){
        stopMe=true;
    }
    @Override
    public void run() {
        while(!stopMe){
            for (int i = 0; i < n; i++) {
                System.out.println("Could you stop me?> "+ i);
            }
        }
        if(stopMe){
            System.out.println("\n ************ \n stop !!! \n***********\n");
        }
    }
}
