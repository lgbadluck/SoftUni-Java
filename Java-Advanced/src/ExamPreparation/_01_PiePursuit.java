package ExamPreparation;

import jdk.jshell.EvalException;

import java.util.*;
import java.util.stream.Collectors;

public class _01_PiePursuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> eatingCapacity = new ArrayDeque<>();
        ArrayDeque<Integer> eachPiePieces = new ArrayDeque<>();

        int[] inputsContestants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int number : inputsContestants) {
            eatingCapacity.offer(number);
        }

        int[] inputsPiePieces = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int number : inputsPiePieces) {
            eachPiePieces.push(number);
        }


        while (!eatingCapacity.isEmpty() && !eachPiePieces.isEmpty()) {
            int contestantCapacity = eatingCapacity.poll();
            int piePiecesToEat = eachPiePieces.pop();

            if (contestantCapacity >= piePiecesToEat) {
                int newCapacity = contestantCapacity - piePiecesToEat;
                if (newCapacity > 0) {
                    eatingCapacity.offer(newCapacity);
                }
            } else {
                int remainingPiePieces = piePiecesToEat - contestantCapacity;
                if (remainingPiePieces == 1) {
                    if (!eachPiePieces.isEmpty()) {
                        remainingPiePieces = remainingPiePieces + eachPiePieces.pop();
                    }
                }
                eachPiePieces.push(remainingPiePieces);
            }
        }
        if(eachPiePieces.isEmpty() && !eatingCapacity.isEmpty()) {
            System.out.println("We will have to wait for more pies to be baked!");
            System.out.print("Contestants left: ");
            String remainingContestants = eatingCapacity.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(", "));
            System.out.println(remainingContestants);
        }
        else if (eachPiePieces.isEmpty() && eatingCapacity.isEmpty()) {
            System.out.println("We have a champion!");
        }
        else {
            System.out.println("Our contestants need to rest!");
            System.out.print("Pies left: ");
            String remainingPiePieces = eachPiePieces.reversed()
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));
            System.out.println(remainingPiePieces);
        }

    }
}
