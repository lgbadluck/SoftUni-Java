package TextProcessingMoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String input = scanner.nextLine();

            String name, age;
            int nameStartIdx, nameEndIdx;
            int ageStartIdx, ageEndIdx;

            nameStartIdx = input.indexOf('@')+1;
            nameEndIdx = input.indexOf('|');
            ageStartIdx = input.indexOf('#')+1;
            ageEndIdx = input.indexOf('*');

            name = input.substring(nameStartIdx, nameEndIdx);
            age = input.substring(ageStartIdx, ageEndIdx);

            System.out.println(name + " is " + age + " years old.");

            n--;
        }
    }
}
