package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

    public static void main(String[] args) {
        String fileName = "new_file.txt";

        // creating a file with io.File
        File file = new File(fileName);
        boolean wasCreated = false;
        if ( file.exists() ){
            System.out.println("The file already exists");
        } else {
            System.out.println();
            try {
                wasCreated = file.createNewFile();
                System.out.println("File created");
            } catch (IOException e) {
                System.out.println("There was an error");
                throw new RuntimeException(e);
            }
        }

        // creating a file with PrintWriter and FileWriter
        String fileName1 = "writer_file.txt";
        File file1 = new File(fileName1);

        if (file1.exists()){
            System.out.println("file already exists");
        } else {
            // creating the file
            try {
                PrintWriter output = new PrintWriter(new FileWriter(file1));
                output.close();
                System.out.println("File created");
            } catch (IOException e) {
                System.out.println("There was an error: " + e.getMessage());
                // this will print all the trace of the errors
                e.printStackTrace();
            }
        }



    }

}
