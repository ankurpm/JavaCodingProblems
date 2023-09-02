package Ch8_FunctionalProgramming.P168;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ExecuteAroundPatternTest {

    @InjectMocks
    Doubles doubles;

    @Test
    void test_doublesGetFirst() throws IOException {
        double result = doubles.read((Scanner sc)-> doubles.getFirst(sc));
        assertEquals(3.2, result);
    }

    @Test
    void test_doublesSumAll() throws IOException {
        double result = doubles.read((Scanner sc)-> doubles.sumAll(sc));
        assertEquals(7.4, result);
    }
}
