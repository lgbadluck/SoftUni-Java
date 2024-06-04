package StreamsFilesDirectoriesLabs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class _06_SortLines {
        public static void main(String[] args) throws IOException {
            // Keep this file in the same directory as the project
            String path = "src/StreamsFilesDirectoriesLabs/input.txt";

            List<String> lines = Files.readAllLines(Paths.get(path)).stream()
                    .sorted()
                    .collect(Collectors.toList());

            Files.write(Paths.get("src/StreamsFilesDirectoriesLabs/output.txt"), lines);
        }
    }
