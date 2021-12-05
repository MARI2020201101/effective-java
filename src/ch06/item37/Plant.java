package ch06.item37;

public class Plant {
    public enum LifeCycle{
        ANNUAL, PERENNIAL, BIENNIAL;

    }
    private final String name;
    private final LifeCycle lifeCycle;

    public Plant(String name,LifeCycle lifeCycle){
        this.name=name;
        this.lifeCycle=lifeCycle;
    }

    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    @Override
    public String toString() {
        return "Plant[ " + name  + " / " + lifeCycle + " ] ";
    }
}
