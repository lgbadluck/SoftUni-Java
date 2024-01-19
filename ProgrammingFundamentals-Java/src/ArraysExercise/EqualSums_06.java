package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (numbers.length==1) {
                System.out.println(i);
                return;
            }
            for (int j = 0; j < i; j++) {
                leftSum+=numbers[j];
            }
            for (int j = numbers.length-1; j >= i+1 ; j--) {
                rightSum+=numbers[j];
            }
            if (leftSum==rightSum) {
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(!isFound) System.out.println("no");
    }
}
