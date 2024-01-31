package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        while (!input[0].equals("End")) {
            String cmd = input[0];

            if (cmd.equals("Add")) {
                int number = Integer.parseInt(input[1]);
                addNumberToList(numbers, number);
            } else if (cmd.equals("Insert")) {
                int number = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                insertNumberToList(numbers, number, index);
            } else if (cmd.equals("Remove")) {
                int index = Integer.parseInt(input[1]);
                removeNumberToList(numbers, index);
            } else if (cmd.equals("Shift")) {
                String direction = input[1];
                int count = Integer.parseInt(input[2]);
                shiftLeftOrRight(numbers, direction, count);
            }

            input = scanner.nextLine().split(" ");
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void addNumberToList(List<Integer> list, int value) {
        list.add(value);
    }

    public static void removeNumberToList(List<Integer> list, int index) {
        if (index < 0 || index > list.size() - 1) {
            System.out.println("Invalid index");
            return;
        }
        list.remove(index);
    }

    public static void insertNumberToList(List<Integer> list, int value, int index) {
        if (index < 0 || index > list.size() - 1) {
            System.out.println("Invalid index");
            return;
        }
        list.add(index, value);
    }

    public static void shiftLeftOrRight(List<Integer> list, String direction, int count) {
        for (int i = 0; i < count; i++) {
            if (direction.equals("left")) {
                int temp = list.get(0);

                for (int j = 0; j < list.size() - 1; j++) {
                    list.set(j, list.get(j + 1));
                }
                list.set(list.size() - 1, temp);
            } else if (direction.equals("right")) {
                int temp = list.get(list.size() - 1);

                for (int j = list.size() - 1; j > 0; j--) {
                    list.set(j, list.get(j - 1));
                }
                list.set(0, temp);
            }
        }
    }
}
