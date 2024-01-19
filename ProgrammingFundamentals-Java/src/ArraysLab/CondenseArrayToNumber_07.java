package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int[] condensed = new int[1];
        boolean isNotArray = false;
        do {
            if (nums.length==1) {
                System.out.println(nums[0]);
                isNotArray = true;
                break;
            }
            condensed = new int[nums.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = nums[i]+nums[i+1];
            }
            nums = new int[nums.length-1];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = condensed[i];
            }
        } while (condensed.length > 1);

        if(!isNotArray) System.out.println(condensed[0]);
    }
}
