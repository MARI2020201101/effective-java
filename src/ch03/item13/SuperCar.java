package ch03.item13;

public class SuperCar extends Car implements Cloneable{
    public SuperCar(String name){
        super(name);
        System.out.println("생성자");
        //내가 메소드 호출하지 않았지만 재정의해서 부모클래스에서 불르고있따.....
    }

    @Override
    public void ride() {
        System.out.println("메소드"); // 오미쳤다. 생성자보다 빨리 부른다
        System.out.println("슈퍼 빠르게 달린다!!");
    }

    @Override
    public SuperCar clone()  {
        return (SuperCar) super.clone();
    }
}
