package ch02.item2;

public class MyStringBuilder {

    private String string;
    public MyStringBuilder(){
        this.string="";
    }

    public String toString(){
        return this.string;
    }

    public MyStringBuilder append(String s) {
        this.string+=s;
        return this;
    }
}
