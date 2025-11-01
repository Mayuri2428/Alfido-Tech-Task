import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4FileReader {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FileReaderDemo <path-to-text-file>");
            return;
        }

        String path = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}