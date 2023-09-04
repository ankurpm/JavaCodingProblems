package Ch8_FunctionalProgramming.P171;

import java.util.function.Consumer;

public class ManufactureCarLambda {

    public void manufacture(String transmissionType, Consumer<String> transmission, String topType, Consumer<String> carTop){
        System.out.println("*** Manufacturing process started ***");
        chassis();
        transmission.accept(transmissionType);
        carTop.accept(topType);
        wheels();
        System.out.println("*** Manufacturing process ended ***");

    }

    private void chassis(){
        System.out.println("Chassis has been added");
    }

    private void wheels(){
        System.out.println("wheels and tyres added");
    }
}
