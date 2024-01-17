import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isInsideInterval = ( (number >= -100 && number <= 100) && (number !=0) );

        if (isInsideInterval) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
