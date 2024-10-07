package snack_machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {

    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine(){
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        // List to stored adquired products
        List<Snack> products = new ArrayList<>();
        System.out.println("*** Snack Machine ***");
        while (!exit) {
            try {
                int option = showMenu(scan);
                exit = executeOptions(option, scan, products);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println();
            }

        }

    }

    private static int showMenu(Scanner scan){
        System.out.println("""
                ====================
                1. Buy Snack
                2. Show ticket
                3. Add Snack
                4. Exit
                ====================
                Select an option:\s
                """);
        // read and return selected option
        return Integer.parseInt(scan.nextLine());
    }

    private static boolean executeOptions(int option, Scanner scan, List<Snack> products){
        boolean exit = false;
        switch (option) {
            case 1 -> buySnack(scan, products);
            case 2 -> showTicket(products);
            case 3 -> addSnack(scan);
            case 4 -> {
                System.out.println("Bye");
                exit = true;
            }
        }

        return exit;
    }

    public static void buySnack(Scanner scan, List<Snack> products){
        Snacks.showSnacks(); // show the available inventory
        System.out.println("Select a snack (id): ");
        int snackId = Integer.parseInt(scan.nextLine());
        // check the id is in the list
        boolean snackFound = false;
        for (Snack snack: Snacks.getSnacks()) {
            if (snackId == snack.getSnackId()){
                // adding the snack to bought products
                products.add(snack);
                System.out.println("Snack added to the list " + snack);
                snackFound = true;
                break;
            }
        }
        if (!snackFound) {
            System.out.println("Snack doesn't exists");
        }
    }

    public static void showTicket(List<Snack> products){
        // calculate the total amount
        double[] total = {0};
        products.forEach(product -> total[0] += product.getSnackPrice());
        // showing the products plus the total value
        System.out.println("\n****** Ticket ******");
        products.forEach(System.out::println);
        System.out.println("Total: " + total[0] + "\n");

    }

    private static void addSnack(Scanner scan){
        System.out.println("Insert the name of the snack");
        String name = scan.nextLine();
        System.out.println("Insert the price of the snack");
        int price = Integer.parseInt(scan.nextLine());
        Snacks.addSnack(new Snack(name, price));
        System.out.println("New snack Added");
    }


}
