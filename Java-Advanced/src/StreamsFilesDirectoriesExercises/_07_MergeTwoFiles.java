package StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class _07_MergeTwoFiles {

    public static void main(String[] args) throws IOException {

        String firstFileContent = Files.readString(Path.of("src/StreamsFilesDirectoriesExercises/inputOne.txt"));
        String secondFileContent = Files.readString(Path.of("src/StreamsFilesDirectoriesExercises/inputTwo.txt"));

        PrintWriter writer = new PrintWriter("src/StreamsFilesDirectoriesExercises/output.txt");
        writer.println(firstFileContent);
        writer.println(secondFileContent);
        writer.close();
    }
}