package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFullFile {

    public static void main(String[] args) {

        String fileName = "writer_file.txt";

        try {
            // Read all lines
            // Using class Files from the package nio (new io)
            // will return a list with all lines in a list of Strings
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            // content of the file
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("There was an error" + e);
        }

    }

}
