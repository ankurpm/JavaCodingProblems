package Ch8_FunctionalProgramming.P169;

import java.util.Map;
import java.util.function.Supplier;

public class CarFactory {

    private static final Map<String, Supplier<Vehicle>> CARS = Map.of("DieselCar", DieselCar::new, "PetrolCar", PetrolCar::new, "ElectricCar", ElectricCar::new);

    public static Vehicle newInstance(Class<?> clazz){
        Supplier<Vehicle> vehicleSupplier = CARS.get(clazz.getSimpleName());
        return vehicleSupplier.get();
    }
    /*
    public static Vehicle newInstance(Class<?> clazz){
        switch (clazz.getSimpleName()){
            case "DieselCar":
                return new DieselCar();
            case "PetrolCar":
                return new PetrolCar();
            case "ElectricCar":
                return new ElectricCar();
            default:
                return null;
        }
    }

     */
}
