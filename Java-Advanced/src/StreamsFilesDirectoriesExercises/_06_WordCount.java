package StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class _06_WordCount {

    public static void main(String[] args) throws IOException {

        String[] words = Files.readString(Path.of("src/StreamsFilesDirectoriesExercises/words.txt")).split("\\s+");
        String text = Files.readString(Path.of("src/StreamsFilesDirectoriesExercises/text.txt"));

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, 0);
        }

        for (String word : text.split("\\s+")) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            }
        }

        PrintWriter writer = new PrintWriter("src/StreamsFilesDirectoriesExercises/result.txt");
        wordCount.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();
    }
}
