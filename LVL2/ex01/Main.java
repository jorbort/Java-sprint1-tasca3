import java.util.HashSet;

class Main {

    public static void main(String[] argv) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant rest1 = new Restaurant("mcdonalds", 5);
        Restaurant rest2 = new Restaurant("mcdonalds", 5);
        Restaurant rest3 = new Restaurant("mcdonalds", 3);
        restaurants.add(rest1);
        System.out.println(
            "size of restaurants after adding restaurant 1: " +
            restaurants.size()
        );
        restaurants.add(rest2);
        System.out.println(
            "size of restaurants after adding restaurant 2 which is the same name and score as 1 : " +
            restaurants.size()
        );
        restaurants.add(rest3);
        System.out.println(
            "size of restaurants after adding restaurant 3 which is the same name but different score as 1 : " +
            restaurants.size()
        );
    }
}
