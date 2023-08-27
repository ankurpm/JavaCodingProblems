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
}
