package LVL2.ex01;
import java.util.Objects;

class Restaurant {

    private String name;
    private int score;

    public Restaurant(String p_name, int p_score) {
        name = p_name;
        score = p_score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant other = (Restaurant) obj;

        return name.equals(other.name) && score == other.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
