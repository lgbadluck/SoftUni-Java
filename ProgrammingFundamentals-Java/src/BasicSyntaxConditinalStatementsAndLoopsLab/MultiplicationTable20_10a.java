package BasicSyntaxConditinalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable20_10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i < 11; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }
    }
}
