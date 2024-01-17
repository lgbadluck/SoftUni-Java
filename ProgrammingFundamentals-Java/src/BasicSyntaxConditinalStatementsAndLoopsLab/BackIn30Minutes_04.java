package BasicSyntaxConditinalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        if (mins >= 30) {
            mins = (mins + 30) % 60;
            hours= (hours + 1) % 24;
        } else {
            mins = mins + 30;
        }

        System.out.printf("%d:%02d\n", hours, mins);
    }
}
