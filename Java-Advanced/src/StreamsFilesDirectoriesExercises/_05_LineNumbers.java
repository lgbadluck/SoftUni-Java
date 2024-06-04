package StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _05_LineNumbers {

    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesDirectoriesExercises/inputLineNumbers.txt";

        List<String> lines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("src/StreamsFilesDirectoriesExercises/output.txt");

        int counter = 1;
        for (String line : lines) {
            String output = String.format("%d. %s", counter, line);
            counter++;
            writer.println(output);
        }

        writer.close();
    }
}