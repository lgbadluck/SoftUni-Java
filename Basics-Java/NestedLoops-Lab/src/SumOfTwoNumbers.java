import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i=startInterval; i<=endInterval; i++) {
            for (int j=startInterval; j<=endInterval; j++) {
                counter++;
                if (i+j==magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", counter, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d\n", counter, magicNumber);
    }
}
