import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String destinationName;
        double moneyToSave;
        double savedMoney;

        while (!input.equals("End")) {
            destinationName = input;
            moneyToSave = Double.parseDouble(scanner.nextLine());
            while (moneyToSave > 0) {
                savedMoney = Double.parseDouble(scanner.nextLine());
                moneyToSave -= savedMoney;
            }
            System.out.printf("\nGoing to %s!", destinationName);
            input = scanner.nextLine();
        }
    }
}
