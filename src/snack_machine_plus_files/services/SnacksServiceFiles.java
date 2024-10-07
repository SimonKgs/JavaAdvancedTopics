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
                this.snacks = getSnacksFromFile();
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

    private List<Snack> getSnacksFromFile(){
        ArrayList<Snack> snacks = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));

            for (String line: lines) {
                // getting the values of the file
                String[] snackLine = line.split(",");
                // getting name and price needed to create the snack again
                String name = snackLine[1];
                double price = Double.parseDouble(snackLine[2]);
                // creating the snack and adding to the List
                Snack snack = new Snack(name, price);
                snacks.add(snack);
            }

        } catch ( Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return snacks;
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
            output.println(snack.writeSnack());
            output.close();

        } catch (Exception e) {
            System.out.println("There was an error adding the snack to the file: " + e);
        }

    }

    @Override
    public void showSnacks() {
        System.out.println("---Available Snacks-----");
        String snacksInventory = "";
        for (Snack snack: this.snacks) {
            snacksInventory += snack + "\n";
        }

        System.out.println(snacksInventory);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
