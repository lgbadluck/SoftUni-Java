package DataTypesandVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= amount; i++) {
            int total = 0;
            int temp = i;
            while (temp > 0) {
                total += i % 10;
                temp = temp / 10;
            }
            boolean isSpecialNumber = (total == 5 || total == 7 || total == 11);
            String tF = "";
            if (isSpecialNumber) tF = "True";
            else tF = "False";

            System.out.printf("%d -> %s\n", i, tF);
        }
    }
}
