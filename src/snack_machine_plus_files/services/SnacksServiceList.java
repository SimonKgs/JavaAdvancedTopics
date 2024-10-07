package snack_machine_plus_files.services;

import snack_machine_plus_files.domain.Snack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SnacksServiceList implements Serializable, ISnacksService {

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

    public void addSnack(Snack snack) {
        snacks.add(snack);
        System.out.printf("Snack %s added", snack.getSnackName());
    }

    public void showSnacks() {
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

    public List<Snack> getSnacks() {
        return snacks;
    }
}
