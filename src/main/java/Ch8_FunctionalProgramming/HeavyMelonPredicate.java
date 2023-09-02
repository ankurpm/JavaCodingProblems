package Ch8_FunctionalProgramming;

public class HeavyMelonPredicate implements MelonPredicate{
    @Override
    public boolean test(Melon melon) {
        return melon.getWeight()>500;
    }
}
