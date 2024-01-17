import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextByte();

        if (grade >= 5) {
            System.out.printf("Excellent!\n");
        }
    }
}