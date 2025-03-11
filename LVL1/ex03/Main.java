import java.util.HashMap;

class Main {

    public static void main(String[] argv) {
        FileReader reader = new FileReader();
        HashMap<String, String> countries = reader.readFile();
        System.out.println(countries);
    }
}
