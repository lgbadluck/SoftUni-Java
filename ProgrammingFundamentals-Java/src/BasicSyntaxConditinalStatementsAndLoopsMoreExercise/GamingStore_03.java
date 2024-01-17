package BasicSyntaxConditinalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  totalMoney = Double.parseDouble(scanner.nextLine());
        String inputText = scanner.nextLine();
        double price = 0.0;
        double totalSpent = 0.0;

        while ( !(inputText.equals("Game Time")) ) {
            boolean isValidGame = true;
            switch (inputText) {
                case "OutFall 4":                   price = 39.99; break;
                case "CS: OG":                      price = 15.99; break;
                case "Zplinter Zell":               price = 19.99; break;
                case "Honored 2":                   price = 59.99; break;
                case "RoverWatch":                  price = 29.99; break;
                case "RoverWatch Origins Edition":  price = 39.99; break;
                default:
                    System.out.println("Not Found");
                    isValidGame=false;
                    break;
            }
            if (isValidGame && totalMoney>=price) {
                System.out.printf("Bought %s\n", inputText);
                totalSpent+=price;
                totalMoney-=price;
            } else if (isValidGame && totalMoney<price) System.out.println("Too Expensive");
            if (totalMoney==0) {
                break;
            }
            inputText = scanner.nextLine();
        }
        if (totalMoney!=0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", totalSpent,totalMoney);
        } else {
            System.out.println("Out of mo-ney!");
        }
    }
}
