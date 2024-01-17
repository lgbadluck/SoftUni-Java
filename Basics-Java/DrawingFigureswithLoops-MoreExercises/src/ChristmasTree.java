import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        System.out.print(" | ");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print(" | ");
            for (int j = n; j >= 1; j--) {
                if (j > n - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }


    }
}
