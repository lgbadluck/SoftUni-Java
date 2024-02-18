package MidExam_18_02_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> booksList = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            if (input.contains("Add Book")) {
                String bookName = input.split(" \\| ")[1];
                if (!booksList.contains(bookName)) {
                    booksList.add(0, bookName);
                }
            } else if (input.contains("Take Book")) {
                String bookName = input.split(" \\| ")[1];
                booksList.remove(bookName);
            } else if (input.contains("Swap Book")) {
                String bookName1 = input.split(" \\| ")[1];
                String bookName2 = input.split(" \\| ")[2];
                if (booksList.contains(bookName1) && booksList.contains(bookName2)) {
                    int idxBook1 = booksList.indexOf(bookName1);
                    int idxBook2 = booksList.indexOf(bookName2);
                    booksList.set(idxBook2, bookName1);
                    booksList.set(idxBook1, bookName2);
                }
            } else if (input.contains("Insert Book")) {
                String bookName = input.split(" \\| ")[1];
                if (!booksList.contains(bookName)) {
                    booksList.add(bookName);
                }
            } else if (input.contains("Check Book")) {
                int idx = Integer.parseInt(input.split(" \\| ")[1]);
                if (idx >= 0 && idx < booksList.size()) {
                    System.out.println(booksList.get(idx));
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(booksList.toString()
                .replace("[", "")
                .replace("]", ""));
    }
}
