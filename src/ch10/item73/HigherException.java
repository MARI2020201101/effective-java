package ch10.item73;

public class HigherException extends RuntimeException{
    public HigherException(Throwable cause){
        super(cause);
    }
}
