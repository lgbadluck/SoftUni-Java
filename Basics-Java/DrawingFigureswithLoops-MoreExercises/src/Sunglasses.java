import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Top ROW
        printTopOrBotRow(n);

        //Middle ROWs (n-2 rows)
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int j = 1; j <= n; j++) {
                if (i == (n - 1) / 2) {
                    System.out.print("|");
                } else System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }

        //Bottom ROW
        printTopOrBotRow(n);
    }

    static void printTopOrBotRow(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= 2 * n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
