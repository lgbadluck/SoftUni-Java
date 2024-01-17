import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double amountToDeposit;
        double sum = 0;

        while ( !input.equals("NoMoreMoney") ) {
            amountToDeposit = Double.parseDouble(input);
            if (amountToDeposit<0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum+=amountToDeposit;
            System.out.printf("Increase: %.2f\n", amountToDeposit);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f\n", sum);
    }
}
