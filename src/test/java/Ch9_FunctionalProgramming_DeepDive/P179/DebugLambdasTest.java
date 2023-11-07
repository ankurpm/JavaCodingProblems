package Ch9_FunctionalProgramming_DeepDive.P179;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DebugLambdasTest {

    @InjectMocks
    DebugLambda mock;

    /**
     *You will that when you call debugMethod(), it will throw null pointer exception
     * BUT there will be no proper error in the stack trace
     * It will just show that an error has occurred, and we won't even know which element has the error
     */
    @Test
    void test1(){
        mock.debugMethod1();
    }

    @Test
    void test2(){
        mock.debugMethod2();
    }

}
