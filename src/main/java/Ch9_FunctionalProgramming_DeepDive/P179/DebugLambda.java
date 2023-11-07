package Ch9_FunctionalProgramming_DeepDive.P179;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugLambda {

    public void debugMethod(){
        List<String> names = Arrays.asList("Ron","Mike","Sandra",null,"Kyle");
        names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

    }


}
