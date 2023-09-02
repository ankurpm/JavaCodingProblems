package Ch8_FunctionalProgramming.P166;

public class HeavyMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return melon.getWeight()>500;
    }
}
