package DataTypesandVariablesLab;

import java.util.Scanner;

public class SpecialNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int x=i;
            do {
                sum += x%10;
                x/=10;
            } while (x>0);
            if (sum==5 || sum==7 || sum==11) System.out.printf("%d -> True\n", i);
            else System.out.printf("%d -> False\n", i);
        }
    }
}
