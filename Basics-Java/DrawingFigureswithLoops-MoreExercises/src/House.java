import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int cntr = 0;
        if (n % 2 == 0 ) cntr = n / 2 - 2;
        else  cntr = n / 2 - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //Even Ns
                if (n % 2 == 0) {
                    if (n == 2 && i == 1) { //Hardcode for N=2
                        System.out.print("*");
                        continue;
                    }
                    if (i == 1 && (j < n / 2 || j > n / 2 + 1)) {
                        System.out.print("-");
                    } else if (i == 1) {
                        System.out.print("*");
                    }
                    //Prints roof of the house for Even Ns
                    if (i == n / 2) {
                        System.out.print("*");
                    } else if (i > 1 && i <= n / 2) {
                        if ( (j <= cntr || j > n-cntr) ) System.out.print("-");
                        else System.out.print("*");
                    }

                    //Prints the base of the house for Even Ns
                    else if (i > n / 2) {
                        if (j == 1 || j == n) System.out.print("|");
                        else System.out.print("*");
                    }


                    //Odd Ns
                } else if (n % 2 == 1) {
                    if (i == 1 && j == n / 2 + 1)
                        System.out.print("*");
                    else if (i == 1 && (j < n / 2 + 1 || j > n / 2 + 1)) {
                        System.out.print("-");
                    }
                    //Prints roof of the house for Odd Ns
                    if (i == n / 2 + 1) {
                        System.out.print("*");
                    } else if (i > 1 && i <= n / 2) {
                        if ( (j <= cntr || j > n-cntr) ) System.out.print("-");
                        else System.out.print("*");
                    }

                    //Prints the base of the house for Odd Ns
                    else if (i > n / 2 + 1) {
                        if (j == 1 || j == n) System.out.print("|");
                        else System.out.print("*");
                    }
                }
            }
            if (i >= 2 && i<n/2) cntr--;
            System.out.println();
        }

    }

}
