package _03_InheritanceExercise._06_Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animalList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("Beast!")) {
            String animalType = input;
            String[] animalInfo = scanner.nextLine().split("\\s+");

            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animalType) {
                    case "Dog":
                        animalList.add(new Dog(name, age, gender));
                        break;
                    case "Frog":
                        animalList.add(new Frog(name, age, gender));
                        break;
                    case "Cat":
                        animalList.add(new Cat(name, age, gender));
                        break;
                    case "Kitten":
                        animalList.add(new Kitten(name, age));
                        break;
                    case "Tomcat":
                        animalList.add(new Tomcat(name, age));
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine();
        }

        animalList.forEach(System.out::println);
    }
}
