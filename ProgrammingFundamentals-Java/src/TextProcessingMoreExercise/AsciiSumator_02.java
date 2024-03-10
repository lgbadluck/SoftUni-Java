package TextProcessingMoreExercise;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int sum = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol > start && symbol < end) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
