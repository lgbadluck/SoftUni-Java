import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tempInC = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f", (tempInC*1.8)+32);
    }
}
