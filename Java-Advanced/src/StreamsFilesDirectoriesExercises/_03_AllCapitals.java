package StreamsFilesDirectoriesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class _03_AllCapitals {

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("src/StreamsFilesDirectoriesExercises/input.txt"));

        content = content.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/StreamsFilesDirectoriesExercises/output.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }
}