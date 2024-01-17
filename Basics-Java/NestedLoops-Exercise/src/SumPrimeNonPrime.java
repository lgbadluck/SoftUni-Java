import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        int inputNumber = 0;
        String inputText = scanner.nextLine();

        while (!inputText.equals("stop")) {
            inputNumber = Integer.parseInt(inputText);
            if (inputNumber < 0) {
                System.out.printf("Number is negative.\n");
                inputText = scanner.nextLine();
                continue;
            }
            boolean isNonPrime = false;
            for (int i = 2; i < inputNumber; i++) {
                if (inputNumber % i == 0) {
                    sumNonPrime+=inputNumber;
                    isNonPrime=true;
                    break;
                }
            }
            if (!isNonPrime) {
                sumPrime+=inputNumber;
            }
            inputText = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\nSum of all non prime numbers is: %d\n", sumPrime, sumNonPrime);

    }
}
