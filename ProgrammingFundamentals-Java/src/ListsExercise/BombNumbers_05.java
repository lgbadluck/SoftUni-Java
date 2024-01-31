package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNum = Integer.parseInt(scanner.nextLine());
        int bombPower = Integer.parseInt(scanner.nextLine());

        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
