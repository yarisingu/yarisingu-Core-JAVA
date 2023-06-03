package filehandling;

//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";

        // Read from a file
        try {
            FileReader reader = new FileReader(filePath);
            int character;
            System.out.println("File content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Write to a file
        try {
            FileWriter writer = new FileWriter(filePath, true); // Append mode
            writer.write("\nHello, World!");
            writer.write("\nThis is a sample file.");
            writer.close();
            System.out.println("\nData written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

