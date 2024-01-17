import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i=1; i<=n*2; i++) {
            int x = Integer.parseInt(scanner.nextLine());
            if (i <= n) {sumLeft+=x;}
            else {sumRight+=x;}
        }

        if (sumLeft==sumRight) {
            System.out.printf("Yes, sum = %d\n", sumLeft);
        }
        else {
            System.out.printf("No, diff = %d\n", Math.abs(sumRight-sumLeft));

        }

    }
}
