package ch02.item5;

import java.util.function.Supplier;

public class ChocoSupplier {

    public Chocolate givemeChoco(Supplier<? extends Chocolate> supplier){
        return supplier.get();
    }
}
