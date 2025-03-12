import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class FileReader {

    String fileRoute = "./countries.txt";

    public FileReader() {}

    HashMap<String, String> readFile() throws FileNotFoundException {
        HashMap<String, String> map = new HashMap<>();
        try {
            File file = new File(fileRoute);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split("\\s+");
                    if (parts.length == 2) map.put(parts[0], parts[1]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
        return map;
    }
}
