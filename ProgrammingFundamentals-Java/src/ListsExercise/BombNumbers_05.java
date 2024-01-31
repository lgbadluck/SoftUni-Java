package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bombInputs = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(bombInputs[0]);
        int bombPower = Integer.parseInt(bombInputs[1]);

        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        while (numbers.contains(bombNum)) {
            int idx = numbers.indexOf(bombNum);
            int start = idx - bombPower;
            int end = idx + bombPower;
            if(start<0) start = 0;
            if(end>numbers.size()-1) end = numbers.size()-1;
            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }
        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        int sum =0;
        for (int i = 0; i < numbers.size(); i++) {
            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
}
