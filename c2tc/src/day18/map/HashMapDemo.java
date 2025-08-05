package day18.map;

import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class HashMapDemo {
    public static void main(String[] args) {

        // Creating a HashMap with custom Student objects
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(5, "Ram"));
        map.put(2, new Student(2, "Bharat"));
        map.put(3, new Student(4, "Lakshman"));
        map.put(4, new Student(3, "Hanuman"));
        map.put(5, new Student(1, "Shiv"));

        // Sorting the map by Student.id using streams
        Map<Integer, Student> sorted = map.entrySet()
            .stream()
            .sorted(Comparator.comparing(entry -> entry.getValue().id))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        // Printing the sorted result
        System.out.println("Sorted Student Results are:");
        sorted.forEach((k, v) -> System.out.println(v));
    }
}