import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i=0;
        while (i>=0) {
            i = Double.parseDouble(scanner.nextLine());
            if (i>=0) System.out.printf("Result: %.2f\n", i*2);
        }
        System.out.println("Negative number!");
    }
}
