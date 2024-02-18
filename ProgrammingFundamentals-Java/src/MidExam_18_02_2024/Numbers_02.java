package MidExam_18_02_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            if (input.contains("Add")) {
                Integer value = Integer.parseInt(input.split(" ")[1]);
                numList.add(value);
            } else if (input.contains("Remove")) {
                Integer value = Integer.parseInt(input.split(" ")[1]);
                numList.remove(value);
            } else if (input.contains("Collapse")) {
                int value = Integer.parseInt(input.split(" ")[1]);
                numList.removeIf(n -> n < value);
            } else if (input.contains("Replace")) {
                Integer value = Integer.parseInt(input.split(" ")[1]);
                Integer replaceValue = Integer.parseInt(input.split(" ")[2]);
                if (numList.contains(value)) {
                    int idx = numList.indexOf(value);
                    numList.set(idx, replaceValue);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(numList.toString()
                .replace("[","")
                .replace("]","")
                .replace(",","")
        );
    }
}
