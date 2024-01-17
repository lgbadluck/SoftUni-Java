import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyToSave = Double.parseDouble(scanner.nextLine());
        double currentAmount = Double.parseDouble(scanner.nextLine());
        int daysSpendingCount = 0;
        int days = 0;
        boolean isLastActionSpend = false;

        while (daysSpendingCount < 5) {
            days++;
            String saveOrSpend = scanner.nextLine();
            double amountToSavedOrSpent = Double.parseDouble(scanner.nextLine());

            if (saveOrSpend.equals("spend")) {
                if (currentAmount < amountToSavedOrSpent) currentAmount = 0;
                else currentAmount-= amountToSavedOrSpent;
                isLastActionSpend = true;
                daysSpendingCount++;
            } else if (saveOrSpend.equals("save")) {
                if (isLastActionSpend) {
                    daysSpendingCount=0;
                    isLastActionSpend = false;
                }
                currentAmount+= amountToSavedOrSpent;
                if (currentAmount>=moneyToSave) {
                    System.out.printf("You saved the money for %d days.\n", days);
                    break;
                }
            }

        }

        if (isLastActionSpend) System.out.printf("You can't save the money.\n%d\n", days);
    }
}
