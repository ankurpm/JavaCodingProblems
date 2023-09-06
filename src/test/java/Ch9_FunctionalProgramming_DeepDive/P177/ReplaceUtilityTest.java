package Ch9_FunctionalProgramming_DeepDive.P177;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ReplaceUtilityTest {

    @InjectMocks
    ReplaceUtility replaceUtility;

    @Test
    void test1(){
        List<String> inputList = Arrays.asList("Ankur","Steffi");
        List<String> result = replaceUtility.replace(inputList, s-> s.toUpperCase());
        assertThat(result).hasSize(2);
        assertEquals(inputList.get(0).toUpperCase(),result.get(0));
        assertEquals(inputList.get(1).toUpperCase(),result.get(1));
    }
}
