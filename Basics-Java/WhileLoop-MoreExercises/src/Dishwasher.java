import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottleDetergent = Integer.parseInt(scanner.nextLine());
        int amountDetergentML = numBottleDetergent * 750;
        int i = 0;
        int numDishes = 0;
        int numPots = 0;

        while (amountDetergentML >= 0) {
            String inputText = scanner.nextLine();
            i++;
            if (inputText.equals("End")) break;
            int numItemsToClean = Integer.parseInt(inputText);
            if (i%3==0) {
                amountDetergentML-=numItemsToClean*15;
                numPots+=numItemsToClean;
            } else {
                amountDetergentML-=numItemsToClean*5;
                numDishes+=numItemsToClean;
            }
        }

        if (amountDetergentML>=0) {
            System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.\n", numDishes, numPots, amountDetergentML);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!\n", Math.abs(amountDetergentML) );
        }

    }

}
