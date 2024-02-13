package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if(input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int value1 = numbers.get(index1);
                int value2 = numbers.get(index2);
                numbers.set(index1, value2);
                numbers.set(index2, value1);
            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int value1 = numbers.get(index1);
                int value2 = numbers.get(index2);
                numbers.set(index1, value2*value1);
            }else if (input.contains("decrease")) {
                for (int i = 0; i < numbers.size(); i++) {
                    int num = numbers.get(i);
                    numbers.set(i, num-1);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));
    }
}
