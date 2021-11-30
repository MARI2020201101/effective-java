package ch02.item2;

public class NutrientFacts {

    private int servingSize;
    private int calories;
    private int fat;
    private int carb;
    private int protein;
    private int vitamin;

    private NutrientFacts(){
    }

    public void printNutrientFacts(){
        System.out.printf("servingSize %d \n" +
                "calories %d \n fat %d \n carb %d \nprotein %d \nvitamin %d \n",
                servingSize,calories,fat,carb,protein,vitamin);
    }

    public NutrientFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.carb = builder.carb;
        this.protein = builder.protein;
        this.vitamin = builder.vitamin;
    }

    public static class Builder{
        private int servingSize;
        private int calories;
        private int fat = 0;
        private int carb = 0;
        private int protein = 0;
        private int vitamin = 0;

        public Builder(int servingSize, int calories){
            this.calories = calories;
            this.servingSize = servingSize;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        public Builder carb(int carb){
            this.carb = carb;
            return this;
        }
        public Builder protein(int protein){
            this.protein = protein;
            return this;
        }
        public Builder vitamin(int vitamin){
            this.vitamin = vitamin;
            return this;
        }

        public NutrientFacts build(){
            return new NutrientFacts(this);
        }
    }

}
