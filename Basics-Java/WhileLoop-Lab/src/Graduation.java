import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = 1;
        String studentName = scanner.nextLine();
        double yearlyMarks = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        while (yearlyMarks>=4.00) {
            sum+=yearlyMarks;
            if (grade >= 12) {
                System.out.printf("%s graduated. Average grade: %.2f\n", studentName, (sum/grade) );
                break;
            }
            yearlyMarks = Double.parseDouble(scanner.nextLine());
            grade++;
        }

        if (yearlyMarks<4.00) {
            System.out.printf("%s has been excluded at %d grade\n", studentName, grade);
        }


    }
}
