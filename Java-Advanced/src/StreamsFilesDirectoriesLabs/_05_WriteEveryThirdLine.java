package StreamsFilesDirectoriesLabs;


import java.io.*;

public class _05_WriteEveryThirdLine {
        public static void main(String[] args) throws IOException {
            // Keep this file in the same directory as the project
            String path = "src/StreamsFilesDirectoriesLabs/input.txt";

            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("src/StreamsFilesDirectoriesLabs/output.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            String line = reader.readLine();
            int counter = 1;
            while (line != null) {

                if (counter % 3 == 0) {
                    writer.write(line);
                    writer.newLine();
                }
                counter++;
                line = reader.readLine();
            }
            writer.close();
        }
    }
