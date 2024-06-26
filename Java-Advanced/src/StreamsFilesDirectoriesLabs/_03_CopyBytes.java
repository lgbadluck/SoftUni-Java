package StreamsFilesDirectoriesLabs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class _03_CopyBytes {
    public static void main(String[] args) throws IOException {
        // Keep this file in the same directory as the project
        String path = "src/StreamsFilesDirectoriesLabs/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("src/StreamsFilesDirectoriesLabs/output.txt");

        PrintWriter writer = new PrintWriter(outputStream);

        int ascciCode = inputStream.read();
        while (ascciCode != -1) {
            if (ascciCode == ' ') {
                writer.print(" ");
            } else if (ascciCode == '\n') {
                writer.println();
            } else {
                writer.print(ascciCode);
            }
            ascciCode = inputStream.read();
        }
        writer.close();
    }
}
