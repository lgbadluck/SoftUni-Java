import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudentTakenExam = Integer.parseInt(scanner.nextLine());
        int counterStudentTop = 0;
        int counterStudent4to5 = 0;
        int counterStudent3to4 = 0;
        int counterStudentFailed = 0;
        double sumGrades = 0.0;

        for (int i = 1; i <= numStudentTakenExam; i++) {
            double gradeThisStudentGot = Double.parseDouble(scanner.nextLine());
            sumGrades+=gradeThisStudentGot;
            if (gradeThisStudentGot<3.00) {
                counterStudentFailed++;
            }
            if (gradeThisStudentGot>=3.00 && gradeThisStudentGot<=3.99) {
                counterStudent3to4++;
            }
            if (gradeThisStudentGot>=4.00 && gradeThisStudentGot<=4.99) {
                counterStudent4to5++;
            }
            if (gradeThisStudentGot>=5.00) {
                counterStudentTop++;
            }
        }

        System.out.printf("Top students: %.2f%%\n", (double)counterStudentTop/numStudentTakenExam*100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (double)counterStudent4to5/numStudentTakenExam*100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", (double)counterStudent3to4/numStudentTakenExam*100.0);
        System.out.printf("Fail: %.2f%%\n", (double)counterStudentFailed/numStudentTakenExam*100.0);
        System.out.printf("Average: %.2f\n", sumGrades/numStudentTakenExam);
    }
}
