import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCount = 0;

        for (int numA=startInterval; numA<=endInterval; numA++) {
            for (int numB=startInterval; numB<=endInterval; numB++) {
                combinationCount++;
                if (numA+numB == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", combinationCount, numA, numB, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d\n", combinationCount, magicNumber);
    }
}
