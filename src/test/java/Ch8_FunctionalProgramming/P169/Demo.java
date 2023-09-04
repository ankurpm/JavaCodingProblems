package Ch8_FunctionalProgramming.P169;

import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        //DieselCar dc = (DieselCar) CarFactory.newInstance(DieselCar.class);
        PetrolCar pc = (PetrolCar) CarFactory.newInstance(PetrolCar.class);
    }
}
