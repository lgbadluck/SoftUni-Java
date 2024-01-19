package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        while (rotations>0) {
            int temp = numbers[0];
            if (rotations == numbers.length) break;
            if (rotations > numbers.length) rotations=rotations-numbers.length;
            for (int i = 0; i < numbers.length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1]=temp;
            rotations--;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
