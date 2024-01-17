import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJudges = Integer.parseInt(scanner.nextLine());
        String nameOfPresentation = scanner.nextLine();
        double averageGradeStudent = 0;
        int gradesStudentCounter = 0;

        while (!nameOfPresentation.equals("Finish")) {
            double presentationAverageGrade = 0;
            int gradesPresentationCounter = 0;
            for (int i = 0; i < numJudges; i++) {
                double gradePresentation = Double.parseDouble(scanner.nextLine());
                gradesPresentationCounter++;
                presentationAverageGrade+=gradePresentation;
                gradesStudentCounter++;
                averageGradeStudent+=gradePresentation;
            }
            System.out.printf("%s - %.2f.\n", nameOfPresentation, (presentationAverageGrade/gradesPresentationCounter) );
            nameOfPresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.\n", (averageGradeStudent/gradesStudentCounter) );
    }
}
