package Ch9_FunctionalProgramming_DeepDive.P178;

import java.util.function.Function;

public class Lambda {

    public static final Function<String, String> result = s -> s.toUpperCase();
}
