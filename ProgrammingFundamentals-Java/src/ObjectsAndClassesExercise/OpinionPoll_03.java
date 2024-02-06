package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList= new ArrayList<>();

        while(n>0) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            int age = Integer.parseInt(input[1]);
            Person perssonToAdd = new Person(firstName, age);
            personList.add(perssonToAdd);
            n--;
        }
        for(Person person : personList) {
            if (person.getAge()>30) {
                System.out.printf("%s - %d\n", person.getName(), person.getAge());
            }
        }
    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
