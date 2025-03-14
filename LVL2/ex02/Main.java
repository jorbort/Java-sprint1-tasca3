package LVL2.ex02;
import java.util.HashSet;

class Main {

    public static void main(String[] argv) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant rest1 = new Restaurant("mcdonalds", 5);
        Restaurant rest3 = new Restaurant("mcdonalds", 7);
        Restaurant rest2 = new Restaurant("mcdonalds", 6);
        restaurants.add(rest1);
        restaurants.add(rest3);
        restaurants.add(rest2);
        for (Restaurant rest : restaurants) {
            System.err.println(rest.getName() + " : " + rest.getScore());
        }
    }
}
