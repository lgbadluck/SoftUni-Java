package RandomSentences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class decodeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> legendList = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            legendList.add(input);
            Integer num = Integer.parseInt(input.split(" ")[0]);
            numbersList.add(num);

            input = scanner.nextLine();
        }

        System.out.println(legendList.toString());
        System.out.println(numbersList.toString());
        System.out.println("---===Sorting Lists==----");
        Collections.sort(legendList);
        Collections.sort(numbersList);
        System.out.println(legendList.toString());
        System.out.println(numbersList.toString());


        List<Integer> decodeNumsList = new ArrayList<>();

        int step = 1;
        int count = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
            count++;
            if(count%step == 0) {
                decodeNumsList.add(numbersList.get(i));
                System.out.print("\n");
                count = 0;
                step++;
            }
        }
        System.out.println("--Decoded Numbers--");
        System.out.println(decodeNumsList.toString());

        List<String> decodedStringList = new ArrayList<>();

        for (int i = 0; i < decodeNumsList.size(); i++) {
            String targetValue = String.valueOf(decodeNumsList.get(i));
            System.out.println("targetValue: " + targetValue);
            for (String entry : legendList) {
                if (entry.split(" ")[0].equals(targetValue)) {
                    String decodedWord = entry.split(" ")[1];
                    System.out.println("decodedWord: " + decodedWord);
                    decodedStringList.add(decodedWord);
                    break;
                }
            }
        }
        System.out.println("--Decoded String of Words--");
        System.out.println(decodedStringList.toString()
                .replace("[","")
                .replace("]","")
                .replace(","," "));
    }
}
