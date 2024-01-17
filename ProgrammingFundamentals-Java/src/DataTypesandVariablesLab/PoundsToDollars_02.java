package DataTypesandVariablesLab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountInPounds = Double.parseDouble(scanner.nextLine());

        double amountInDollars = 0.0;
        amountInDollars = (double) amountInPounds * 1.36;

        System.out.printf("%.3f", amountInDollars);
    }
}
