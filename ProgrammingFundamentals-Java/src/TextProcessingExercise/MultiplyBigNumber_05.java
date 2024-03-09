package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        BigInteger num1 = new BigInteger(firstNumber);
        BigInteger num2 = new BigInteger(secondNumber);

        System.out.println(num1.multiply(num2));
    }
}
