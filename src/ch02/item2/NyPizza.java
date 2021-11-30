package ch02.item2;

public class NyPizza extends Pizza{

    public enum Size{SMALL, MEDIUM, LARGE}
    private Size size;

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "NyPizza{" +
                "size=" + size +
                '}';
    }

    static class Builder extends Pizza.Builder<Builder>{
        private Size size;

        public Builder size(Size size){
            this.size = size;
            return self();
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Pizza build() {
            return new NyPizza(this);
        }
    }
}
