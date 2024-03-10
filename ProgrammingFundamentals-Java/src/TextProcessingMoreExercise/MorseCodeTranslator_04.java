package TextProcessingMoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store Morse code mappings
        Map<String, Character> morseToLetter = new HashMap<>();

        // Add Morse code mappings for each letter
        morseToLetter.put(".-", 'A');
        morseToLetter.put("-...", 'B');
        morseToLetter.put("-.-.", 'C');
        morseToLetter.put("-..", 'D');
        morseToLetter.put(".", 'E');
        morseToLetter.put("..-.", 'F');
        morseToLetter.put("--.", 'G');
        morseToLetter.put("....", 'H');
        morseToLetter.put("..", 'I');
        morseToLetter.put(".---", 'J');
        morseToLetter.put("-.-", 'K');
        morseToLetter.put(".-..", 'L');
        morseToLetter.put("--", 'M');
        morseToLetter.put("-.", 'N');
        morseToLetter.put("---", 'O');
        morseToLetter.put(".--.", 'P');
        morseToLetter.put("--.-", 'Q');
        morseToLetter.put(".-.", 'R');
        morseToLetter.put("...", 'S');
        morseToLetter.put("-", 'T');
        morseToLetter.put("..-", 'U');
        morseToLetter.put("...-", 'V');
        morseToLetter.put(".--", 'W');
        morseToLetter.put("-..-", 'X');
        morseToLetter.put("-.--", 'Y');
        morseToLetter.put("--..", 'Z');


        String[] input = scanner.nextLine().split(" ");
        for(String letterMorse : input) {
            if(letterMorse.equals("|")) System.out.print(" ");
            else System.out.print(morseToLetter.get(letterMorse));
        }

    }
}
