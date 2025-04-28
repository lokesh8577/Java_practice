import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            // Create and write to the file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, File Handling in Java!");
            writer.close();
            System.out.println("File written successfully.");

            // Read the file
            Scanner reader = new Scanner(new File(fileName));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
