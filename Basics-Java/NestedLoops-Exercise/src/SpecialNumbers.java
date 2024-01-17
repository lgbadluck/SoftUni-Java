import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int numDigits = 1111; numDigits <= 9999; numDigits++) {
            String currentNumString = "" + numDigits;
            int i = Integer.parseInt("" + currentNumString.charAt(0));
            int j = Integer.parseInt("" + currentNumString.charAt(1));
            int k = Integer.parseInt("" + currentNumString.charAt(2));
            int l = Integer.parseInt("" + currentNumString.charAt(3));
            if (i == 0 || j == 0 || k == 0 || l == 0) {
                continue;
            }
            if (num % i == 0 && num % j == 0 && num % k == 0 && num % l == 0) {
                System.out.printf("%d ", numDigits);
            }
        }
    }
}
