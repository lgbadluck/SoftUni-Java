import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int currentSteps = 0;
        int madeSteps = 0;

        while (madeSteps < 10000) {
            if (input.equals("Going home")) {
                currentSteps = Integer.parseInt(scanner.nextLine());
                madeSteps+=currentSteps;
                break;
            }
            currentSteps = Integer.parseInt(input);
            madeSteps+=currentSteps;
            if (madeSteps>=10000) break;
            input = scanner.nextLine();
        }

        if (madeSteps >= 10000) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!\n", madeSteps-10000);
        }
        else System.out.printf("%d more steps to reach goal.\n", 10000-madeSteps);
    }
}
