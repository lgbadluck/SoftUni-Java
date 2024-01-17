import java.util.Scanner;
import java.util.function.DoubleFunction;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven=0;
        int sumOdd=0;

        for (int i=1; i<=n; i++) {
            if (i %2 == 0) {
                sumEven+=Integer.parseInt(scanner.nextLine());
            }
            else {
                sumOdd+=Integer.parseInt(scanner.nextLine());
            }
        }
        if (sumEven==sumOdd) {
            System.out.printf("Yes\nSum = %d\n", sumEven);
        }
        else {
            System.out.printf("No\nDiff = %d\n", Math.abs(sumEven-sumOdd));
        }
    }
}
