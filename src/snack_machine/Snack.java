package snack_machine;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    private static int snackCounter = 0;
    private final int snackId;
    private double snackPrice;
    private String snackName;

    // constructor
    public Snack() {
        this.snackId = ++Snack.snackCounter;
    }

    public Snack(String snackName, double snackPrice) {
        this(); // using the empty constructor, it must be on the first line
        this.snackName = snackName;
        this.snackPrice = snackPrice;
    }

    // setters & getters
    public static int getSnackConter() {
        return snackCounter;
    }

    public int getSnackId() {
        return snackId;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    // methods
    @Override
    public String toString() {
        return "-" + this.snackId + ". " + snackName + ", price: " + snackPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return snackId == snack.snackId && Double.compare(snackPrice, snack.snackPrice) == 0 && Objects.equals(snackName, snack.snackName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackId, snackPrice, snackName);
    }
}
