package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumTotal = 0;
        double avgNumber = 0.0;

        for (int num : numbers) {
            sumTotal += num;
        }

        avgNumber = (double) sumTotal / numbers.size();
        //System.out.println(avgNumber);

        int count = 0;
        boolean notFound = true;
        Collections.sort(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        for (int num : numbers) {
            if (num > avgNumber) {
                System.out.print(num + " ");
                count++;
                notFound = false;
            }
            if (count==5) {
                return;
            }
        }
        if (notFound) {
            System.out.println("No");
            return;
        }
    }
}
