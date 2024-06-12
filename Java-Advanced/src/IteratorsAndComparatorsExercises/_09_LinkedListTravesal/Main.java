package IteratorsAndComparatorsExercises._09_LinkedListTravesal;

import javax.xml.stream.events.Comment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomLinkedList list = new CustomLinkedList();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            int num = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Add":
                    list.addElement(num);
                    break;
                case "Remove":
                    list.removeElement(num);
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
        System.out.println(list.getSize());
//        for (Integer i : list) {
//            System.out.print(i + " ");
//        }
        list.forEach();
    }
}
