package Ch8_FunctionalProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {

    @InjectMocks
    Filter filter;

    @Spy
    ArrayList<Melon> list;

    @Test
    void test_filterByType(){
        list.add(new Melon("type1",34, "canada"));
        filter.filterByType(list, "type1");
    }
}
