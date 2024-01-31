package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //System.out.println(train.toString().replaceAll("[\\[\\],]", ""));

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")){
            String cmd1 = input[0];

            if (cmd1.equals("Delete")) {
                int element = Integer.parseInt(input[1]);
                numbers.remove((Integer) element);
            } else if (cmd1.equals("Insert")) {
                int element = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                numbers.add(index, (Integer) element);
            }

            input = scanner.nextLine().split(" ");;
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
