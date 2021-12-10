package ch10.item74;

public class IndexOutofBoundExceptionTester {
    public static void main(String[] args) {

        try {
            outOfIndexMethodV2();
        }catch (MyIndexOutofBoundException e){
            e.printStackTrace();
        }

    }
    public static void outOfIndexMethod() throws MyIndexOutofBoundException{
        int[] arr = new int[1];
        for (int i = 0; i < 2; i++) {
            arr[i] = 0;
        }
    }
    public static void outOfIndexMethodV2() {
        throw new MyIndexOutofBoundException(0,0,1);
    }
}
