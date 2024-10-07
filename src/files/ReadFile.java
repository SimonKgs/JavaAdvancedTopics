package files;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        String fileName = "writer_file.txt";
        File file = new File(fileName);

        // Read the file
        // the class FileReader only let read one char at a time
        // So we need to use FileReader to
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line;
            // to read the full file I need to do this line by line
            // using a loop and I use a variable to store the current line
            do {
                line = input.readLine();
                if ( line != null)  System.out.println(line);
            } while (line != null);

            // it is needed to close the file after use it
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("There was an error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
