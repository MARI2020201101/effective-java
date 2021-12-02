package ch03.item13;

public class Car implements Cloneable{
    private String name;
    public Car(String name){
        System.out.println("내이름은 " + name);
        ride();
    }

    public void ride(){
        System.out.println("부릉부릉 달린다!!");
    }

    @Override
    public Car clone()  {
       try{
           ride();
           return (Car)super.clone();
       }catch (CloneNotSupportedException e){
           throw new AssertionError();
       }
    }
}
