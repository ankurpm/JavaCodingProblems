package Ch9_FunctionalProgramming_DeepDive.P177;

import java.util.ArrayList;
import java.util.List;

public class ReplaceUtility {

    public List<String> replace(List<String> input, Replacer<String> replacer){
        List<String> result = new ArrayList<>();
        for(String s: input){
            result.add(replacer.replace(s));
        }
        return result;
    }
}
