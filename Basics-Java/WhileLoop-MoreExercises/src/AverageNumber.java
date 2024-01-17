import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number;
        double sum = 0;

        for (int i=0; i<n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum+=number;
        }
        System.out.printf("%.2f\n", sum/n);
    }
}
