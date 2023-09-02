package Ch8_FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

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
}
