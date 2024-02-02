package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //System.out.println(numbers);
        numbers.addAll(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        //System.out.println(numbers);
        List<Integer> result = new LinkedList<>();

        int startRange = 0;
        int endRange = 0;
        for (int i = 0; i <= numbers.size() / 2 - 1; i++) {
            result.add(numbers.get(i));
            result.add(numbers.get(numbers.size() - 1 - i));
            if (i == numbers.size() / 2 - 1) {
                startRange = (numbers.get(i));
                endRange = (numbers.get(numbers.size() - 1 - i));
                break; // Don't put the Constraints in result (middle two Ints of the list)
            }
        }
        if (endRange < startRange) {
            int temp = startRange;
            startRange = endRange;
            endRange = temp;
        }
        //System.out.println("start: " + startRange + "\nend: " + endRange);

        Collections.sort(result); // sort the list
        for (int num : result) {
            if (num > startRange && num < endRange) System.out.print(num + " ");
        }
        //System.out.println(result.toString().replaceAll("[\\[\\],]", " ")); // print the sorted list
    }
}
