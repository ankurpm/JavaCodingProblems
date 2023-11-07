package Ch9_FunctionalProgramming_DeepDive.P179;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugLambda {

    /**
     * This method will throw a "null pointer" exception
     */
    public void debugMethod1(){
        List<String> names = Arrays.asList("Ron","Mike","Sandra",null,"Kyle");
        names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

    }

    public void debugMethod2(){
        List<String> names = Arrays.asList("Ron","Mike","Sandra",null,"Kyle");
        names.stream()
                .peek(s-> System.out.println("stream():"+s))
                .map(String::toUpperCase)
                .peek(s-> System.out.println("map():"+s))
                .sorted()
                .peek(s-> System.out.println("sorted():"+s))
                .collect(Collectors.toList());

    }


}
