package Ch8_FunctionalProgramming.P170;

public class StringTransformer {

    public static String transform(String s, StringFunction fucntion){
        return fucntion.execute(s);
    }
}
