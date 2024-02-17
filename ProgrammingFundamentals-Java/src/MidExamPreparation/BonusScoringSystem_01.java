package MidExamPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        List<Integer> studentAttendanceList = new ArrayList<>();

        while (numStudents > 0) {
            studentAttendanceList.add(Integer.parseInt(scanner.nextLine()));
            numStudents--;
        }
        int maxValue = 0;
        if (!studentAttendanceList.isEmpty()) maxValue = Collections.max(studentAttendanceList);
        double bonusMax = 0;
        if (numLectures != 0)  bonusMax = ((double) maxValue / (double) numLectures) * (5.0 + additionalBonus);

        System.out.printf("Max Bonus: %.0f.\nThe student has attended %d lectures.\n", Math.ceil(bonusMax), maxValue);
    }
}
