package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        // a set also inherit from collection
        // a set don't allow duplicate elements
        // TreeSet will keep the order of how the elements where inserted
        Set<String> set1 = new TreeSet<>();
        // It has almost the same methods of the ArrayList
        boolean firstJunaAdded = set1.add("Juna");
        // add method first checks if it already exists on the Set
        // if it is duplicate ignore the element
        boolean secondJunaAdded = set1.add("Juna"); // it don't show an error, but it won't be added
        set1.add("Pepe");

        System.out.println("Before remove");
        set1.forEach(System.out::println);


        // To remove an element from the set:
        // Check if the element exists; if it does, remove it; if it doesn't, ignore the operation.
        // but don't show any error
        // it returns true if was capable of do the operation and false if not
        boolean juanRemoved = set1.remove("Juan");
        boolean pepeRemoved =set1.remove("Pepe");



        System.out.println((firstJunaAdded) ? "\nFirst Juna was added" : "First Juna was already the List");
        System.out.println((secondJunaAdded) ? "Second Juna was added" : "Second Juna was already the List");
        System.out.println((juanRemoved) ? "Juan was removed" : "Juan was not in the List");
        System.out.println((pepeRemoved) ? "Pepe was removed" : "Pepe was not in the List\n\n");
        System.out.println("\nAfter remove");
        set1.forEach(System.out::println);

    }
}
