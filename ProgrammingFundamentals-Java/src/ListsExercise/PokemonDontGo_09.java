package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;
        while (!numbers.isEmpty()) {
            //System.out.println(numbers);
            int idx = Integer.parseInt(scanner.nextLine());

            int valueBeRemoved = 0; //numbers.get(idx);
            if (idx < 0) {
                valueBeRemoved = numbers.get(0);
                sumRemoved += valueBeRemoved;
                numbers.set(0, numbers.get(numbers.size() - 1));
            } else if (idx >= numbers.size()) {
                valueBeRemoved = numbers.get(numbers.size() - 1);
                sumRemoved += valueBeRemoved;
                numbers.set((numbers.size() - 1), numbers.get(0));
            } else {
                valueBeRemoved = numbers.get(idx);
                sumRemoved += valueBeRemoved;
                numbers.remove(idx);
            }

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > valueBeRemoved) {
                    numbers.set(i, numbers.get(i) - valueBeRemoved);
                } else {
                    numbers.set(i, numbers.get(i) + valueBeRemoved);
                }
            }
        }
        System.out.println(sumRemoved);
    }
}
