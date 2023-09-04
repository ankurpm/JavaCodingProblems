package Ch8_FunctionalProgramming.P170;

public class Demo {

    public static void main(String[] args) {
        /*
        Converting a string to lowercase
         */
        String s1 = StringTransformer.transform("This Is Americas", String::toLowerCase);
        System.out.println(s1);

        /*
        Removing space from a given string
         */
        String s2 = StringTransformer.transform("This Is Americas", s -> s.replaceAll("\\s",""));
        System.out.println(s2);
    }
}
