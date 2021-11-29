package ch02.item2;

public enum ChocolatePotV4 {
    CHOCOLATE_POT_V4("chocolate with heart");

    private String chocolate;

    ChocolatePotV4(String chocolate){
        this.chocolate=chocolate;
    }
    public void printName(){
        System.out.println("i am singlton choco pot v4");
        System.out.println("i can make "+chocolate);
    }
}
