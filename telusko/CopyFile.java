package telusko;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) throws IOException {

        // Get the source and destination file paths from the user
        System.out.println("Enter the source file path:");
        String sourcePath = System.console().readLine();
        System.out.println("Enter the destination file path:");
        String destinationPath = System.console().readLine();

        // Create FileReader and FileWriter objects
        FileReader reader = new FileReader(sourcePath);
        FileWriter writer = new FileWriter(destinationPath);

        // Read and write the file contents
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        // Close the reader and writer objects
        reader.close();
        writer.close();

        System.out.println("File copied successfully!");
    }
}