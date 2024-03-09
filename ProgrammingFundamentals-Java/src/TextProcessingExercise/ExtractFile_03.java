package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");
        String fileName = input[input.length-1].split("\\.")[0];
        String extName = input[input.length-1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extName);
    }
}
