import java.util.Scanner;
import java.util.function.DoubleFunction;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i=1; i<=n; i++) {
            int x = Integer.parseInt(scanner.nextLine());
                if (x <= min) {min = x;}
                if (x >= max) {max = x;}
        }
        // Output
        //Max number:
        //Min number:
        System.out.printf("Max number: %d\nMin number: %d\n", max, min);
    }
}
