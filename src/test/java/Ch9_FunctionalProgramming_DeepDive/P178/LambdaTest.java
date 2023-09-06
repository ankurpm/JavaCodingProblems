package Ch9_FunctionalProgramming_DeepDive.P178;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LambdaTest {

    @Test
    void test1(){
        String result = Lambda.result.apply("teststring");
        assertEquals("TESTSTRING", result);
    }
}
