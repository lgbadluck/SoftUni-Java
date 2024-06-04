package StreamsFilesDirectoriesLabs;


import java.io.*;
import java.util.Scanner;

public class _04_ExtractIntegers {
        public static void main(String[] args) throws IOException {
            // Keep this file in the same directory as the project
            String path = "src/StreamsFilesDirectoriesLabs/input.txt";

            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("src/StreamsFilesDirectoriesLabs/output.txt");

            Scanner scanner = new Scanner(inputStream);
            PrintWriter writer = new PrintWriter(outputStream);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    writer.println(number);
                } else {
                    scanner.next();
                }
            }

            writer.close();
        }
    }
