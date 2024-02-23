package MapsLambdaStreamAPIsLab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsStrings = scanner.nextLine().toLowerCase().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : wordsStrings) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 0);
            }
            wordsMap.put(word, wordsMap.get(word) + 1);
        }

        List<String> oddOccurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 == 1) oddOccurrences.add(entry.getKey());
        }

        System.out.println(oddOccurrences.toString().replace("[","").replace("]",""));
    }
}
