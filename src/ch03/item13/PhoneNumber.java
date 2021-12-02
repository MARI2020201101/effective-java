package ch03.item13;

public class PhoneNumber implements Cloneable{
    private final int num1;
    private final int num2;
    private final int num3;

    public PhoneNumber(int num1, int num2, int num3){
        validateNumber(num1, num2, num3);
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    private void validateNumber(int num1, int num2, int num3) {
        if(! (num1>0 && num2 > 0 && num3 > 0) ) throw new RuntimeException("유효하지 않은 넘버");
    }

    @Override
    public PhoneNumber clone(){
        try{
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e.getCause()); //checked 예외를 unchecked 예외로 변환한다
        }
    }

    @Override
    public String toString() {
        return "[ " + num1 +" - " + num2 + " - " + num3 + " ]";
    }
}
