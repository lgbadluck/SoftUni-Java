package ArraysLab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = new String[8];

        days[0]="Invalid day!";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="Wednesday";
        days[4]="Thursday";
        days[5]="Friday";
        days[6]="Saturday";
        days[7]="Sunday";

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (dayNumber >= 1 && dayNumber<=7) System.out.printf("%s\n", days[dayNumber]);
        else System.out.printf("%s\n", days[0]);
    }
}
