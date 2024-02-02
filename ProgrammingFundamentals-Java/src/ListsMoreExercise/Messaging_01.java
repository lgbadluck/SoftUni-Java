package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        StringBuilder text = new StringBuilder(scanner.nextLine());
        String output = "";

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            int sum = 0;
            while (num != 0) {
                int modulo = num % 10;
                sum += modulo;
                num /= 10;
            }
            output = output + popGivenCharFromString(sum, text);
        }
        System.out.println(output);
    }

    public static String popGivenCharFromString(int idx, StringBuilder text) {
        int idxInString = 0;
        if (idx > text.length() - 1) idxInString = idx % text.length();
        else idxInString = idx;
        String result = "";
        result = "" + text.charAt(idxInString);
        text.deleteCharAt(idxInString);
        return result;
    }
}
