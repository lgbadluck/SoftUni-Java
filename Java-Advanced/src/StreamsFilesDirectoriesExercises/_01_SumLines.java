package StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _01_SumLines {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesDirectoriesExercises/input.txt";

        List<String> lines = Files.readAllLines(Path.of(path));

        for (String line : lines) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
        }
    }

}
