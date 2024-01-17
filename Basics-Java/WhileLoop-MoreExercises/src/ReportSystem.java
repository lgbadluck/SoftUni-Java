import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSalesInDollars = Integer.parseInt(scanner.nextLine());
        double numCashTrans = 0;
        double amountCashTrans = 0;
        double numCreditCardTrans = 0;
        double amountCreditCardTrans = 0;
        int i = 0;

        while ( (amountCashTrans+amountCreditCardTrans) < targetSalesInDollars ) {
            i++;
            String inputText = scanner.nextLine();
            if (inputText.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            int amountTrans = Integer.parseInt(inputText);
            if (i%2==1) {
                if (amountTrans >100 ) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    numCashTrans++;
                    amountCashTrans+=amountTrans;
                }
            } else {
                if (amountTrans<10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    numCreditCardTrans++;
                    amountCreditCardTrans+=amountTrans;

                }
            }
        }

        if ((amountCashTrans+amountCreditCardTrans) >= targetSalesInDollars) {
            System.out.printf("Average CS: %.2f\nAverage CC: %.2f\n", (amountCashTrans/numCashTrans), (amountCreditCardTrans/numCreditCardTrans) );
        }
    }
}
