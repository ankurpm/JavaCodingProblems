package Ch8_FunctionalProgramming.P166;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

    public List<Melon> filterByType(List<Melon> melons, String type){
        List<Melon> result = new ArrayList<>();
        for(Melon m: melons){
            if(m.getType().equals(type)){
                result.add(m);
            }
        }
        return result;
    }

    public List<Melon> filterByWeight(List<Melon> melons, int weight){
        List<Melon> result = new ArrayList<>();
        for(Melon m: melons){
            if(m.getWeight() == weight){
                result.add(m);
            }
        }
        return result;
    }
    public List<Melon> filterByTypeAndWeight(List<Melon> melons, String type, int weight){
        List<Melon> result = new ArrayList<>();
        for(Melon m: melons){
            if((m.getWeight() == weight) && m.getType().equals(type)){
                result.add(m);
            }
        }
        return result;
    }

    public List<Melon> filterUsingPredicateParameter(List<Melon> melons, MelonPredicate predicate){
        List<Melon> result = new ArrayList<>();
        for(Melon m : melons){
            if(predicate.test(m)){
                result.add(m);
            }
        }
        return result;
    }

    public <T> List<T> filterUsingFunctionalInterface(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T t: list){
            if(t != null && predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}
