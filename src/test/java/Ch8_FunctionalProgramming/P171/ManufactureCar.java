package Ch8_FunctionalProgramming.P171;

public abstract class ManufactureCar {

    public void manufacture(String transmission, String top){
        chassis();
        transmission(transmission);
        top(top);
        wheels();
    }

    private void chassis(){
        System.out.println("Chassis has been added");
    }

    public abstract void transmission(String s);

    public abstract void top(String s);

    private void wheels(){
        System.out.println("wheels and tyres added");
    }
}
