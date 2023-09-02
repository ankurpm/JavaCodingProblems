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

    @Test
    void test_filterByType(){
        List<Melon> list = Mockito.spy(new ArrayList<>());
        list.add(new Melon("type1",34, "canada"));
        list.add(new Melon("type2",34, "canada"));
        List<Melon> result = filter.filterByType(list, "type1");
        assertThat(result).hasSize(1);
    }

    @Test
    void test_filterByWeight(){
        List<Melon> list = Mockito.spy(new ArrayList<>());
        list.add(new Melon("type1",340, "canada"));
        list.add(new Melon("type2",314, "canada"));
        List<Melon> result = filter.filterByWeight(list, 314);
        assertThat(result).hasSize(1);
    }
    @Test
    void test_filterByTypeAndWeight(){
        List<Melon> list = Mockito.spy(new ArrayList<>());
        list.add(new Melon("type1",340, "canada"));
        list.add(new Melon("type2",314, "canada"));
        List<Melon> result = filter.filterByTypeAndWeight(list, "type1",314);
        assertThat(result).hasSize(0);
    }

    @Test
    void test_HeavyMelonPredicate(){
        List<Melon> list = Mockito.spy(new ArrayList<>());
        list.add(new Melon("Musk",340, "canada"));
        list.add(new Melon("Water",501, "canada"));
        List<Melon> result = filter.filterUsingPredicateParameter(list, new HeavyMelonPredicate());
        assertThat(result.get(0)).isSameAs(list.get(1));
    }
}
