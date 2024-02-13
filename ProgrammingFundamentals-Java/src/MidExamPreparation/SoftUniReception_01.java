package MidExamPreparation;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int countHours = 0;

        while (studentCount > 0) {
            studentCount -= employee1;
            studentCount -= employee2;
            studentCount -= employee3;
            countHours++;
            if (countHours % 4 == 0) {
                countHours++;
            }
        }
        System.out.printf("Time needed: %dh.\n", countHours);
    }
}
