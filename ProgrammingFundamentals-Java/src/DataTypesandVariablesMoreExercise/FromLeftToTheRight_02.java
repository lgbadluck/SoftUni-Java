package DataTypesandVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String numberStr = "";
        long num1 = 0;
        long num2 = 0;
        boolean isSecondNumber = false;

        while (n>0) {
            String inputText = scanner.nextLine();

            for (int i = 0; i < inputText.length(); i++) {
                if (!(inputText.charAt(i) == ' ')) {
                    numberStr = numberStr + inputText.charAt(i);
                } else {
                    if (!isSecondNumber) {
                        num1 = Long.parseLong(numberStr);
                        numberStr = "";
                        isSecondNumber = true;
                        continue;
                    }
                    continue;
                }
            }
            if (isSecondNumber) {
                num2 = Long.parseLong(numberStr);
                numberStr = "";
                isSecondNumber = false;
            }

            int sum = 0;
            long biggerNumber = 0;
            if (num1 > num2) {
                biggerNumber = num1;
            } else biggerNumber = num2;

            biggerNumber=Math.abs(biggerNumber);
            while (biggerNumber > 0) {
                sum += biggerNumber%10;
                biggerNumber /= 10;
            }

            System.out.println(sum);
            n--;
        }
    }
}
