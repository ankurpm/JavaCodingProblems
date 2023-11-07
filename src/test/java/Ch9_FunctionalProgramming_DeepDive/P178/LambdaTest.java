package Ch9_FunctionalProgramming_DeepDive.P178;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LambdaTest {

    @InjectMocks
    Lambda lambda;

    @Test
    void test1(){
        String result = Lambda.result.apply("teststring");
        assertEquals("TESTSTRING", result);
    }

    @Test
    void test_LambdaInsideMethod1(){
        List<String> input = Arrays.asList("One", "Two", "Three", "Four");
        List<String> resultList = lambda.readStringFromStringsRefactored(input);
        assertThat(resultList).hasSize(input.size());
    }

    @Test
    void test_LambdaInsideMethod2(){
        List<String> input = Arrays.asList("One", "Two", "Three", "Four");
        List<String> resultList = lambda.readStringFromStrings(input);
        assertThat(resultList).hasSize(input.size());
    }

    @Test
    void test_staticMethod() {
        String s1 = "One";
        String result = Lambda.returnCharacter(s1);
        assertThat(result.equals(s1.toUpperCase()));
    }
}
