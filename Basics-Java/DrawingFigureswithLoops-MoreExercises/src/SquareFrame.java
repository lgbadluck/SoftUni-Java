import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    if (j == 1 || j == n ) {
                        System.out.printf("+ ");
                    } else System.out.printf("- ");
                }
                else  {
                    if (j == 1 || j == n) {
                        System.out.printf("| ");
                    } else System.out.printf("- ");
                }
            }
            System.out.printf("\n");
        }
    }
}
