package MapsLambdaStreamAPIsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInaString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Character, Integer> charsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char thisChar = input.charAt(i);
            if (thisChar != ' ') {
                if (!charsMap.containsKey(thisChar)) {
                    charsMap.put(thisChar, 0);
                }
                charsMap.put(thisChar, charsMap.get(thisChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
