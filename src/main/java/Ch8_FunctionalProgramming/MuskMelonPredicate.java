package Ch8_FunctionalProgramming;

public class MuskMelonPredicate implements MelonPredicate{
    @Override
    public boolean test(Melon melon) {
        return melon.getType().equals("type1");
    }
}
