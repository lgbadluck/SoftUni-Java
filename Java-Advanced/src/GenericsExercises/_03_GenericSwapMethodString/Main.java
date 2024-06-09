package GenericsExercises._03_GenericSwapMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Задача 3:
        Box<String> box = new Box<>();
        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            box.add(line);
        }
        //Задача 4:
//        Box<Integer> box = new Box<>();
//        for (int row = 0; row < n; row++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            box.add(number);
//        }
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        box.swap(index1, index2);
        System.out.println(box);
    }
}
