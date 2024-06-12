package IteratorsAndComparatorsExercises._07_EquallityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonNameComparator2());
        HashSet<Person> personHashSet = new HashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            personTreeSet.add(person);
            personHashSet.add(person);
        }

        System.out.println(personTreeSet.size());
        System.out.println(personHashSet.size());
    }
}
