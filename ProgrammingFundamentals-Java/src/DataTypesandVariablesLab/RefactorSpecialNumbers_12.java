package DataTypesandVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= amount; i++) {
            int total = 0;
            int temp = i;
            do {
                total += i % 10;
                temp /=  10;
            } while (temp > 0);
            if (total == 5 || total == 7 || total == 11) System.out.printf("%d -> True\n", i);
            else System.out.printf("%d -> False \n", i);
        }
    }
}
