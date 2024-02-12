package MidExamPreparation;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWins = 0;
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("End of battle")) {
            int distanceToEnemy = Integer.parseInt(input);

            if(distanceToEnemy>initialEnergy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy\n", countWins, initialEnergy);
                return;
            } else {
                initialEnergy-=distanceToEnemy;
                countWins++;
            }
            if(countWins%3==0) {
                initialEnergy+=countWins;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d\n", countWins, initialEnergy);
    }
}
