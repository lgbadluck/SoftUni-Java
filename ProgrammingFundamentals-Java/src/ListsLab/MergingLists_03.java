package ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersA = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        List<Double> numbersB = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        List<Double> mergeABlist = new ArrayList<Double>();

        int smallerSize = 0;
        int biggerSize = 0;
        if (numbersA.size() >= numbersB.size()) {
            smallerSize = numbersB.size();
            biggerSize = numbersA.size();
        } else {
            smallerSize = numbersA.size();
            biggerSize = numbersB.size();
        }

        for (int i = 0; i < smallerSize; i++) {
            mergeABlist.add(numbersA.get(i));
            mergeABlist.add(numbersB.get(i));
        }
        for (int i = smallerSize; i < biggerSize; i++) {
            if (numbersA.size() >= numbersB.size()) mergeABlist.add(numbersA.get(i));
            else mergeABlist.add(numbersB.get(i));
        }

        System.out.println(joinElementsByDelimiter(mergeABlist, " "));

    }

    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }
}
