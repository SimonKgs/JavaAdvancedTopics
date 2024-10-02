package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs representing a person.
        // it doesn't keep the order
        Map<String, String> person = new HashMap<>();

        // Add key-value pairs to the map.
        person.put("name", "Xuan");
        person.put("lastname", "Flores");
        person.put("age", "37");
        // it don't allow duplicates
        // If a key already exists in the map, the new value will overwrite the previous value.
        // In this case, the "age" key is updated from "37" to "39".
        person.put("age", "39"); // modify the value
        person.remove("lastname"); // remove an element


        System.out.println("Map values:");
        // print all the set
        person.entrySet().forEach(System.out::println);

        // using a lambda to access the attributes individually
        person.forEach((key, value) -> System.out.println("Key: " + key + " value: " + value));
    }

}
