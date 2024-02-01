package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());
        //System.out.println(numbers);

        String[] command = scanner.nextLine().split(":|\\s");
        while (!(command[0].equals("course") && command[1].equals("start"))) {
            //System.out.println(command[0] + " " + command[1]);
            String cmd1 = command[0];
            switch (cmd1) {
                case "Add":
                    String titleToAdd = command[1];
                    addNewTitleToList(numbers, titleToAdd);
                    break;
                case "Remove":
                    String titleToRemove = command[1];
                    removeTitleFromList(numbers, titleToRemove);
                    break;
                case "Exercise":
                    String titleAddExercise = command[1];
                    addExerciseToList(numbers, titleAddExercise);
                    break;
                case "Swap":
                    String titleSwapThis = command[1];
                    String titleSwapThat = command[2];
                    swapTitleWithNewToList(numbers, titleSwapThis, titleSwapThat);
                    break;
                case "Insert":
                    String titleToInsert = command[1];
                    int atIndex = Integer.parseInt(command[2]);
                    insertTitleAtIndex(numbers, titleToInsert, atIndex);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

            //System.out.println(numbers);
            command = scanner.nextLine().split(":|\\s");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((i + 1) + "." + numbers.get(i));
        }
    }

    public static void addNewTitleToList(List<String> list, String title) {
        if (!list.contains(title)) {
            list.add(title);
        }
    }

    public static void removeTitleFromList(List<String> list, String title) {
        if (list.contains(title)) {
            list.remove(title);
            if (list.contains(title + "-Exercise")) {
                list.remove(title + "-Exercise");
            }
        }
    }

    public static void swapTitleWithNewToList(List<String> list, String titleThis, String titleThat) {
        boolean course1exists = list.contains(titleThis);
        boolean course2exists = list.contains(titleThat);
        boolean exercise1exists = list.contains(titleThis + "-Exercise");
        boolean exercise2exists = list.contains(titleThat + "-Exercise");
        int idxCourse1 = list.indexOf(titleThis);
        int idxCourse2 = list.indexOf(titleThat);
        int idxExercise1 = list.indexOf(titleThis + "-Exercise");
        int idxExercise2 = list.indexOf(titleThat + "-Exercise");

        if (course1exists && course2exists) {
            list.set(idxCourse1, titleThat);
            list.set(idxCourse2, titleThis);
            if (exercise1exists && exercise2exists) {
                list.set(idxExercise1, titleThat + "-Exercise");
                list.set(idxExercise2, titleThis + "-Exercise");
            } else if (exercise1exists) { // Only TitleThis - Course 1 has exercise
                list.remove(idxExercise1);
                list.add(idxCourse2 + 1, (titleThis + "-Exercise"));
            } else if (exercise2exists) { // Only TitleThat - Course 2 has exercise
                list.remove(idxExercise2);
                list.add(idxCourse1 + 1, (titleThat + "-Exercise"));
            }
        }
    }

    public static void addExerciseToList(List<String> list, String title) {
        if (list.contains(title)) { //title exists
            int idx = list.indexOf(title);
            if (!list.contains((title + "-Exercise"))) {
                if (idx == list.size() - 1) {
                    list.add((title + "-Exercise"));
                } else {
                    idx++;
                    list.add(idx, (title + "-Exercise"));
                }
            }
        } else { //title does not exist
            addNewTitleToList(list, title);
            addNewTitleToList(list, (title + "-Exercise"));
        }
    }

    public static void insertTitleAtIndex(List<String> list, String title, int idx) {
        if (!list.contains(title)) {
            list.add(idx, title);
        }
    }

}
