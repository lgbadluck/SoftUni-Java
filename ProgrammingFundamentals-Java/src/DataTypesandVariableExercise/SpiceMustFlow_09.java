package DataTypesandVariableExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long startingYield = Integer.parseInt(scanner.nextLine());
        long spiceExtracted = 0;
        long yieldToday = startingYield;
        int days = 0;

        while (yieldToday >= 100) {
            days++;
            spiceExtracted+=yieldToday;
            //Yield drop by 10 at end of day
            yieldToday-=10;
            //Workers consume 26 at end of day
            spiceExtracted-=26;
        }
        //Workers consume 26 when Yield drops <100
        if (days>0) spiceExtracted-=26;

        System.out.printf("%d\n%d\n", days, spiceExtracted);
    }
}
