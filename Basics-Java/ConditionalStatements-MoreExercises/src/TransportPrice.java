import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        if (n<20) {
            if (dayOrNight.equals("day") ) {
                System.out.printf("%.2f\n", ( 0.70+ (n*0.79) ) );
            }
            else System.out.printf("%.2f\n", ( 0.70+ (n*0.90) ) );
        } else if (n<100) {
            System.out.printf("%.2f\n", (n * 0.09));
        } else {
            System.out.printf("%.2f\n", (n*0.06) );
        }
    }
}
