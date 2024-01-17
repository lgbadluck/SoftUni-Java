import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        String nameOfBesGoalScorer = "";
        int maxGoals = 0;

        while(!inputText.equals("END")) {
            int goalScored = Integer.parseInt(scanner.nextLine());
            if (goalScored>maxGoals) {
                maxGoals=goalScored;
                nameOfBesGoalScorer = inputText;
            }
            if(maxGoals>=10) break;
            inputText = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", nameOfBesGoalScorer);
        if(maxGoals>=3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!\n", maxGoals);
        } else System.out.printf("He has scored %d goals.\n", maxGoals);

    }
}
