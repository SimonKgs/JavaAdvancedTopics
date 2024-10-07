package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) {
        // variable to keep the content or overwrite it
        boolean isAdding = false;
        String fileName = "new_file.txt";
        File file = new File(fileName);

            try{
                // if exist I want to keep the content
                isAdding = file.exists();
                // like previously but passing the parameter which indicates if delete or keep the content
                PrintWriter output = new PrintWriter(new FileWriter(file, isAdding));
                // content that will be added
                String newContent = "This content\nIS write from WriteFile\nusing PrintWriter and FileWriter";
                // adding the content
                output.println(newContent);
                // closing the file
                output.close();
            } catch (Exception e) {
                System.out.println("There was an error: " + e);
            }

    }

}
