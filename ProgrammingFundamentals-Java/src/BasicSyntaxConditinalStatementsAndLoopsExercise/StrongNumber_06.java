package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int sum = 0;
        int sum_temp = 1;

        for (int i = 0; i < num.length(); i++) {
            int x = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum_temp = 1;
            for (int j = 1; j <= x; j++) {
                sum_temp*=j;
            }
            sum += sum_temp;
        }

        if (sum == Integer.parseInt(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
