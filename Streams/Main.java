package Streams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Marc1");
        people.add("Marc2");
        people.add("Marc3");
        people.add("Marc4");
        people.add("Marc5");

        for (String person : people) {
            System.out.println(person);
        }

        boolean containsOne = people.stream()
                .anyMatch(person -> person.contains("1"));

        if (containsOne) {
            System.out.println("At least one name contains '1'.");
        } else {
            System.out.println("No name contains '1'.");
        }
    }
}
