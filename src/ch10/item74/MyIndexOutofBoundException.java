package ch10.item74;

public class MyIndexOutofBoundException extends IndexOutOfBoundsException{

    private int lowerbound;
    private int upperbound;
    private int index;

    public MyIndexOutofBoundException(int lowerbound, int upperbound, int index){

        super(String.format(" 인덱스 최솟값 : %d , 인덱스 최댓값 : %d, " +
                "현재 인덱스 : %d 로 범위를 벗어났습니다.%n", lowerbound,upperbound,index));

        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
        this.index = index;
    }

    public MyIndexOutofBoundException(String message){
        super(message);
    }
}
