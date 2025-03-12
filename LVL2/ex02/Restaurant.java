import java.util.Objects;

class Restaurant implements Comparable<Restaurant> {

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

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) return nameComparison;

        return Integer.compare(other.score, this.score);
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}
