package ch10.item73;

public class ExceptionCauseTester {
    public static void main(String[] args) {
        try{
            doSomthing();
        }catch (Exception e){
            //cause 원인이 되는 exception을 감싸서 새로운 higher exception으로 대치하여 보여준다.
            throw new HigherException(e);
        }
    }

    public static void doSomthing(){
        throw new LowerException();
    }
}
