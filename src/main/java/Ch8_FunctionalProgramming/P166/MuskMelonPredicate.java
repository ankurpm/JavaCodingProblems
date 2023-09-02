package Ch8_FunctionalProgramming.P166;

import Ch8_FunctionalProgramming.P166.Melon;
import Ch8_FunctionalProgramming.P166.MelonPredicate;

public class MuskMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return melon.getType().equals("type1");
    }
}
