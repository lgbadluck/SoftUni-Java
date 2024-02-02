package ListsMoreExercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> drumsInitialQuality = new LinkedList<>();

        drumsInitialQuality.addAll(drums);
        //System.out.println(drums);
        //System.out.println(drumsInitialQuality);

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            for (int i = 0; i < drums.size(); i++) {
                if (drums.get(i) - power <= 0) {
                    int priceThisNewDrum = drumsInitialQuality.get(i) * 3;
                    if (savings >= priceThisNewDrum) {
                        drums.set(i, drumsInitialQuality.get(i));
                        savings -= priceThisNewDrum;
                    } else {
                        drums.remove(i);
                        drumsInitialQuality.remove(i);
                        i--;
                    }
                } else {
                    drums.set(i, (drums.get(i) - power));
                }
            }
            input = scanner.nextLine();
        }
        // The same as the initial quality of the broken drum.
        // The price is calculated by the formula: {initialQuality} * 3.
        for (int drumQuality : drums) {
            System.out.print(drumQuality + " ");
        }
        System.out.printf("\nGabsy has %.2flv.\n", savings);
    }
}
