package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int temp = 0;
        int idx1 = 0;
        int idx2 = 0;
        String[] input = scanner.nextLine().split(" ");

        while ( !input[0].equals("end") ) {
            switch (input[0]) {
                case "swap":
                    idx1 = Integer.parseInt(input[1]);
                    idx2 = Integer.parseInt(input[2]);
                    temp = numbers[idx1];
                    numbers[idx1]=numbers[idx2];
                    numbers[idx2]=temp;
                    break;
                case "multiply":
                    idx1 = Integer.parseInt(input[1]);
                    idx2 = Integer.parseInt(input[2]);
                    numbers[idx1]=numbers[idx1]*numbers[idx2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(!(i==numbers.length-1)) {
                System.out.print(", ");
            }
        }
    }
}
