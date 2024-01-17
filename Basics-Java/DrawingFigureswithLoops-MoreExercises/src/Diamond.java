import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 0) {
            //Top part
            for (int i = 0; i < n / 2; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == n / 2 - i || j == n / 2 + i + 1) {
                        System.out.printf("*");
                    } else System.out.printf("-");
                }
                System.out.println();
            }
            //Bottom part
            for (int i = n - 1; i > n / 2; i--) {
                for (int j = 1; j <= n; j++) {
                    if (j == i || j == n - i + 1) {
                        System.out.printf("*");
                    } else System.out.printf("-");
                }
                System.out.println();
            }


        } else {
            //Top part
            for (int i = 0; i < n / 2 + 1; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 0) {
                        if (j == n / 2 + 1) {
                            System.out.printf("*");
                        } else System.out.printf("-");
                    } else if (j == n / 2 + 1 - i || j == n / 2 + 1 + i) {
                        System.out.printf("*");
                    } else System.out.printf("-");
                }
                System.out.println();
            }

            //Bottom part
            for (int i = n-1; i >= n / 2 + 1; i--) {
                for (int j = 1; j <= n; j++) {
                    if (i == n / 2 + 1) {
                        if (j == n / 2 + 1) {
                            System.out.printf("*");
                        } else System.out.printf("-");
                    } else if (j == i || j == n - i + 1) {
                        System.out.printf("*");
                    } else System.out.printf("-");
                }
                System.out.println();
            }
        }
    }
}
