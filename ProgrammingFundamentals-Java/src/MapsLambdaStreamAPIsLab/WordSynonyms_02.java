package MapsLambdaStreamAPIsLab;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> wordSynonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n>0) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordSynonyms.putIfAbsent(word, new ArrayList<>());
            wordSynonyms.get(word).add(synonym);

            n--;
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordSynonyms.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue().toString().replace("[","").replace("]",""));
        }
    }
}
