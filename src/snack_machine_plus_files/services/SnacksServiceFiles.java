package snack_machine_plus_files.services;

import snack_machine_plus_files.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SnacksServiceFiles implements ISnacksService {

    private final String FILE_NAME = "snacks.txt";
    // Creating the list of snacks
    private List<Snack> snacks = new ArrayList<>();

    public SnacksServiceFiles() {
        File file = new File(FILE_NAME);
        boolean exists = false;

        try {
            exists = file.exists();

            if ( exists ) {
                // this.snacks.getSnacks();
            } else {
                PrintWriter output = new PrintWriter(new FileWriter(file));
                output.close(); // save on disk
                System.out.println("File created");
            }
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        // if doesn't exist
        if (!exists)
            loadInitialSnacks();

    }

    private void loadInitialSnacks() {
        this.addSnack(new Snack("Sugar", 120));
        this.addSnack(new Snack("Drink", 20));
        this.addSnack(new Snack("Chocolate", 60));



    }

    @Override
    public void addSnack(Snack snack) {
        // first add to the arrayList
        this.snacks.add(snack);
        // second save file
        this.addSnackToFile(snack);
    }

    private void addSnackToFile(Snack snack) {
        boolean isAdding = false;
        File file = new File(FILE_NAME);

        try {
            // Try is exist to change the parameter is adding
            isAdding = file.exists();
            PrintWriter output = new PrintWriter(new FileWriter(file, isAdding));
            // adding the snack
            output.println(snack);
            output.close();

        } catch (Exception e) {
            System.out.println("There was an error adding the snack to the file: " + e);
        }

    }

    @Override
    public void showSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
