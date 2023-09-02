package Ch8_FunctionalProgramming.P166;

public class Melon {

    private String type;
    private int weight;
    private String origin;

    public Melon() {
    }

    public Melon(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Melon)) return false;

        Melon melon = (Melon) o;

        if (getWeight() != melon.getWeight()) return false;
        if (getType() != null ? !getType().equals(melon.getType()) : melon.getType() != null) return false;
        return getOrigin() != null ? getOrigin().equals(melon.getOrigin()) : melon.getOrigin() == null;
    }

    @Override
    public int hashCode() {
        int result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + getWeight();
        result = 31 * result + (getOrigin() != null ? getOrigin().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
