package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double sumTimeLeftRacer = 0;
        double sumTimeRightRacer = 0;

        for (int i = 0; i < numbers.size() / 2; i++) {
            int leftTime = numbers.get(i);
            int rightTime = numbers.get(numbers.size()-1 - i);

            if (leftTime == 0) {
                sumTimeLeftRacer *= 0.8;
            } else sumTimeLeftRacer += leftTime;

            if (rightTime == 0) {
                sumTimeRightRacer *= 0.8;
            } else sumTimeRightRacer += rightTime;
        }

        String winner = "";
        double winningTime = 0;
        if (sumTimeLeftRacer<=sumTimeRightRacer) {
            winner="left";
            winningTime=sumTimeLeftRacer;
        } else {
            winner="right";
            winningTime=sumTimeRightRacer;
        }

        System.out.printf("The winner is %s with total time: %.1f\n", winner, winningTime);
    }
}
