package Ch8_FunctionalProgramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FilterTest {

    @InjectMocks
    Filter filter;

   // @Spy
   // ArrayList<Melon> list = new ArrayList<>();

    @Test
    void test_filterByType(){
        List<Melon> list = Mockito.spy(new ArrayList<>());
        list.add(new Melon("type1",34, "canada"));
        List<Melon> result = filter.filterByType(list, "type1");
        assertThat(result).hasSize(1);
    }
}
