package StreamsFilesDirectoriesExercises;

import java.io.File;

public class _08_GetFolderSize {

    public static void main(String[] args) {

        String folderPath = "src/StreamsFilesDirectoriesExercises/Exercises Resources";

        int size = 0;
        File folder = new File(folderPath);

        for (File file : folder.listFiles()) {
            size += file.length();
        }

        System.out.println("Folder size: " + size);
    }
}
