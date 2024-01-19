package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int curCount = 1;
        int x=0;

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]==numbers[i+1]) {
                curCount++;
                if(curCount>count) {
                    x = numbers[i];
                    count=curCount;
                }
            } else {
                curCount=1;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(x + " ");
        }
    }
}
