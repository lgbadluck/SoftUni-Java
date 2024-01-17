package DataTypesandVariableExercise;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double bestSnowball = 0;
        double snowballValue = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;


        while (n>0) {
            n--;
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow( (snowballSnow / snowballTime), snowballQuality);
            if (snowballValue>bestSnowball) {
                bestSnowball = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowball, bestSnowballQuality);
    }
}
