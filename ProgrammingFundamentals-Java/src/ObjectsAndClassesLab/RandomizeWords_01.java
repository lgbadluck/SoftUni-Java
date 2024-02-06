package ObjectsAndClassesLab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        printWordsInRandomOrder(words);
    }

    public static void printWordsInRandomOrder (String[] words) {
        Random random = new Random();

        List<String> wordsList = new LinkedList<>();
        wordsList.addAll(List.of(words));
        //System.out.println(wordsList);

        for (int i = 0; i < words.length; i++) {
            int randomIdx = random.nextInt(wordsList.size());
            String thisWord = wordsList.get(randomIdx);
            System.out.println(thisWord);
            wordsList.remove(randomIdx);
        }
    }
}
