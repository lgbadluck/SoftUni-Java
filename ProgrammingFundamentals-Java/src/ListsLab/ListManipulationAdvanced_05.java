package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            String cmd1 = input[0];
            String cmd2 = ""; // input[1];
            String cmd3 = ""; // input[2];

            switch (cmd1) {
                case "Contains":
                    cmd2 = input[1];
                    printContains(numbers, Integer.parseInt(cmd2));
                    break;
                case "Print":
                    cmd2 = input[1];
                    printAllEvenOdd(numbers, cmd2);
                    break;
                case "Get":
                    cmd2 = input[1];
                    printSumOfAll(numbers);
                    break;
                case "Filter":
                    cmd2 = input[1];
                    cmd3 = input[2];
                    printFilteredBy(numbers, cmd2, Integer.parseInt(cmd3));
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

            input = scanner.nextLine().split(" ");
        }

        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void printAllEvenOdd(List<Integer> inputList, String evenOrOdd) {
        boolean isEven = false;
        if (evenOrOdd.equals("even")) isEven = true;
        if (evenOrOdd.equals("odd")) isEven = false;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) % 2 == 0) {
                if (isEven) System.out.print(inputList.get(i) + " ");
            } else {
                if (!isEven) System.out.print(inputList.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void printSumOfAll(List<Integer> inputList) {
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += inputList.get(i);
        }
        System.out.println(sum);
    }

    public static void printFilteredBy(List<Integer> inputList, String condition, int value) {
        for (int i = 0; i < inputList.size(); i++) {
            switch (condition) {
                case "<":
                    if (inputList.get(i) < value) System.out.print(inputList.get(i) + " ");
                    break;
                case ">":
                    if (inputList.get(i) > value) System.out.print(inputList.get(i) + " ");
                    break;
                case "<=":
                    if (inputList.get(i) <= value) System.out.print(inputList.get(i) + " ");
                    break;
                case ">=":
                    if (inputList.get(i) >= value) System.out.print(inputList.get(i) + " ");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        System.out.println();
    }

    public static void printContains(List<Integer> inputList, int value) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) == value) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No such number");
    }
}
