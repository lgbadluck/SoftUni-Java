package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keySeq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("find")) {
            char[] toDecrypt = input.toCharArray();

            for (int i = 0; i < toDecrypt.length; i++) {
                toDecrypt[i] = (char) (toDecrypt[i] - keySeq[i % keySeq.length]);
            }


            String decrypted = String.valueOf(toDecrypt);
            //System.out.println(decrypted);

            String type, coordinates;
            int typeStart, typeEnd;
            typeStart = decrypted.indexOf('&') + 1;
            typeEnd = decrypted.lastIndexOf('&');

            int coordinatesStart, coordinateEnd;
            coordinatesStart = decrypted.indexOf('<') + 1;
            coordinateEnd = decrypted.lastIndexOf('>');

            type = decrypted.substring(typeStart, typeEnd);
            coordinates = decrypted.substring(coordinatesStart, coordinateEnd);

            System.out.println("Found " + type + " at " + coordinates);

            input = scanner.nextLine();
        }
    }
}
