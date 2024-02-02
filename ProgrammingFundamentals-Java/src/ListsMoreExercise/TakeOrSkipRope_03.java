package ListsMoreExercise;

import java.util.*;

public class TakeOrSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String text = input.replaceAll("\\d+", ""); // remove all digits
        String numbers = input.replaceAll("\\D+", ""); // remove all non-digits
        //System.out.println(text);
        //System.out.println(numbers);

        List<Integer> takeList = new LinkedList<>();
        List<Integer> skipList = new LinkedList<>();

        for (int i = 0; i < numbers.length(); i++) {
            int num = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            if (i%2==0) {
                takeList.add(num);
            } else skipList.add(num);
        }
        //System.out.println(takeList);
        //System.out.println(skipList);

        Queue<Character> charList = new LinkedList<>();
        for (char c : text.toCharArray()){
            charList.add(c);
        }
        //System.out.println(charList);

        String message = "";
        int idx =0;
        for (int i = 0; i < takeList.size(); i++) {
            int toTake = takeList.get(i);
            int toSkip = skipList.get(i);

            for (int j = 0; j < toTake; j++) {
                if(!charList.isEmpty()) message += charList.poll();
            }
            //System.out.println(charList);
            for (int j = 0; j < toSkip; j++) {
                if(!charList.isEmpty()) charList.poll();
            }
            //System.out.println(charList);
        }
        System.out.println(message);
    }
}
