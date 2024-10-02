package snack_machine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Snacks implements Serializable {

    private static final List<Snack> snacks;

    // static initialization block
    // works as a constructor
    // it will be called when the class is loaded
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Potatoes", 80));
        snacks.add(new Snack("Water", 120));
        snacks.add(new Snack("Cheese", 30));
    }

    public static void addSnack(Snack snack) {
        snacks.add(snack);
        System.out.printf("Snack %s added", snack.getSnackName());
    }

    public static void showSnacks() {
        String snacksList = "======= Snack List========\n";
        if (snacks.isEmpty()) {
            snacksList = "The machine is empty";
        }
        else {
            for (Snack snack: snacks){
                snacksList += snack + "\n";
            }
        }
        System.out.println(snacksList);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
}
