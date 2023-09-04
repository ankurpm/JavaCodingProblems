package Ch8_FunctionalProgramming.P171;

public class Jeep extends ManufactureCar{
    @Override
    public void transmission(String s) {
        System.out.println(s+" transmission added");
    }

    @Override
    public void top(String s) {
        System.out.println(s+" top added");
    }
}
