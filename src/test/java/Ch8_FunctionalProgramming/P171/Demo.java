package Ch8_FunctionalProgramming.P171;

public class Demo {

    public static void main(String[] args) {
        /*
        Without using lambda
         */
        Jeep jeep = new Jeep();
        jeep.manufacture("Automatic","Soft");

        /*
        using lambda and functional interface
         */
        new ManufactureCarLambda()
                .manufacture("Automatic", s -> System.out.println(s+" transmission added."),
                        "Hard", s -> System.out.println(s+" top added."));
    }
}
