package LVL1.ex03;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] argv) {
        try {
            FileReader reader = new FileReader();
            HashMap<String, String> countries = reader.readFile();
            System.out.println("enter your username");
            Scanner userInput = new Scanner(System.in);
            String username = userInput.nextLine();
            int userScore = 0;
            for (int i = 0; i < 10; i++) {
                List<Map.Entry<String, String>> entryList = new ArrayList<>(
                    countries.entrySet()
                );
                Map.Entry<String, String> randomEntry = entryList.get(
                    new Random().nextInt(entryList.size())
                );
                System.out.println(
                    "Whats the capital of: " + randomEntry.getKey()
                );
                String answer = userInput.nextLine();
                if (
                    answer
                        .toLowerCase()
                        .trim()
                        .equals(randomEntry.getValue().trim().toLowerCase())
                ) userScore++;
            }
            userInput.close();
            File scoreboard = new File("classification.txt");
            FileWriter writer = new FileWriter(scoreboard.getName(), true);
            writer.write(username + " : " + userScore + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
