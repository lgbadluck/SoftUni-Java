import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат:
        // На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        // За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double counterGroup1 = 0.0; // grade >= 5.00
        double counterGroup2 = 0.0; // grade >= 4.00 && <=4.99
        double counterGroup3 = 0.0; // grade >= 3.00 && <=3.99
        double counterGroup4 = 0.0; // grade < 3.00
        double totalStudentsAverageGrade = 0.0;

        for (int i = 1; i <= numberOfStudents; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine());
            if (studentGrade < 3) counterGroup4++;
            else if (studentGrade >= 3 && studentGrade <= 3.99) counterGroup3++;
            else if (studentGrade >= 4 && studentGrade <= 4.99) counterGroup2++;
            else if (studentGrade >= 5) counterGroup1++;
            totalStudentsAverageGrade+=studentGrade;
        }

        System.out.printf("Top students: %.2f%%\n", counterGroup1/numberOfStudents*100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", counterGroup2/numberOfStudents*100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", counterGroup3/numberOfStudents*100.0);
        System.out.printf("Fail: %.2f%%\n", counterGroup4/numberOfStudents*100.0);
        System.out.printf("Average: %.2f\n", totalStudentsAverageGrade/numberOfStudents);

    }
}
