package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleQueued = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int tempVal = 4-numbers[i];
            if (tempVal>=peopleQueued) {
                numbers[i] += peopleQueued;
                peopleQueued=0;
                break;
            } else {
                peopleQueued -= tempVal;
                numbers[i] += tempVal;
            }
        }
        if (peopleQueued>0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleQueued);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else if (peopleQueued==0 && numbers[numbers.length-1]==4) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else {
            System.out.printf("The lift has empty spots!\n");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

        }

    }
}
