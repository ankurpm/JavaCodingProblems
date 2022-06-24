package Ch5_Arrays_Collections_DS;

import java.util.Objects;

public class Melon {

    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Melon)) return false;
        Melon melon = (Melon) o;
        return getWeight() == melon.getWeight() && Objects.equals(getType(), melon.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getWeight());
    }
}
