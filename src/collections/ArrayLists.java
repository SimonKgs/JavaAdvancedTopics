package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A collection represents a group of objects.
// Some collections allow duplicate elements, while others don't.
// Some collections maintain a specific order, while others don't.

public class ArrayLists {
    public static void main(String[] args) {
        // A List is an interface that inherits from Collection.
        // It allows duplicate elements and maintains the insertion order.
        // When using the class Object in a List, it applies the concept of generics.
        // This is useful when the type of elements is unknown at compile-time.
        // For example, ArrayList is a class that implements the List interface.
        List<Object> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Wednesday");

        for (Object element : myList){
            System.out.println(element);
        }

        // To indicate the type is between <>, now we can use it as String type on the loop
        // it prevents to add different types that maybe don't have to be here
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Monday");
        myStringList.add("Tuesday");
        myStringList.add("Wednesday");
        myStringList.add("Wednesday");

        for (String element : myStringList){
            System.out.println(element);
        }

        // another way to iterate, lambda function, functional programing
        // if I have more lines I can surround the body with {}
        myList.forEach( element -> System.out.println("Element " + element));

        // Using method reference
        // it don't let me add extra info but print every element
        myStringList.forEach(System.out::println);

        // another way to create a List
        // using this method can add the values in the same creation
        // this creates a fixed size list It doesn't allow to modify, add or remove elements of it
        // this is NOT an ArrayList but a List
        List<String> names = Arrays.asList("Juna", "Juan", "Pedro");
        // Don't allow shows an error
        // names.add("pepe");

        // However this way let us initialize on declaration
        // and modify later the list
        // this is an ArrayList, created by passing a modifiable copy of the fixed-size list
        // to the ArrayList constructor
        List<String> products = new ArrayList<>(Arrays.asList(
                "oil",
                "cereal",
                "wine"
        ));
        // adding more products
        products.add("sugar");

        System.out.println("Names list");
        names.forEach(System.out::println);
        System.out.println("\nProducts ArrayList");
        products.forEach(System.out::println);
    }
}
