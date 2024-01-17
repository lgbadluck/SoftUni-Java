import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountDeposited = Double.parseDouble(scanner.nextLine());
        int    time = Integer.parseInt(scanner.nextLine());
        double lihvenProcent = Double.parseDouble(scanner.nextLine());

        double sum = amountDeposited + (time * ((amountDeposited * lihvenProcent/100)/12));

        System.out.println(sum);
    }
}
