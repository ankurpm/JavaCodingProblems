package Ch9_FunctionalProgramming_DeepDive.P178;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambda {

    /*
    Check LambdaTest class in test folder , we have written Unit test for testing this field
     */
    public static final Function<String, String> result = s -> s.toUpperCase();

    /*
    In order to test the below given lambda expression, we need to follow these steps:
    1. Extract the Lambda into a static method
    2. Call the static method using method reference
    To demonstrate this lets create a copy(readStringFromStringsRefactored) of the below method and write the desired code
     */
    public List<String> readStringFromStrings(List<String> strLst){
        return strLst.stream()
                .map(s -> {
                    Random random = new Random();
                    int index = random.nextInt(s.length());
                    String ch = String.valueOf(s.charAt(index));
                    return ch;
                })
                .collect(Collectors.toList());
    }

    public List<String> readStringFromStringsRefactored(List<String> strLst){
        return strLst.stream()
                .map(Lambda::returnCharacter)
                .collect(Collectors.toList());
    }

    // extracting the lambda in method readStringFromStrings() into a static method
    public static String returnCharacter(String s){
        Random random = new Random();
        int index = random.nextInt(s.length());
        String ch = String.valueOf(s.charAt(index));
        return ch;
    }


}
