package ch02.item2;

public class ChicagoPizza extends Pizza{
    private boolean sauceInside;


    private ChicagoPizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {

        return "ChicagoPizza{" + super.toString() +
                "sauceInside=" + sauceInside +
                '}';
    }

    static class Builder extends Pizza.Builder<Builder>{
   /*     private boolean sauceInside;

        public Builder sauceInside(boolean sauceInside){
            this.sauceInside = sauceInside;
            return self();
        }*/
        private boolean sauceInside = false;

        public Builder sauceInside(){
            this.sauceInside = true;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Pizza build() {
            return new ChicagoPizza(this);
        }
    }
}
