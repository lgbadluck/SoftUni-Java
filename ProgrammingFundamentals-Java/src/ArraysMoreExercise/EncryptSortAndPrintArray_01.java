package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //String[] names = scanner.next().split(" ");
        //int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] codes = new int[n];
        for (int i = 0; i < n; i++) {
            codes[i]=0;
        }

        for (int i = 0; i < n; i++) {
            String names = scanner.nextLine();
            for (int j = 0; j < names.length(); j++) {
                char x = names.charAt(j);
                // Vowels: A, E, I, O, U and a, e, i, o, u
                if (x == 'A' || x == 'a' ||
                        x == 'E' || x == 'e' ||
                        x == 'I' || x == 'i' ||
                        x == 'O' || x == 'o' ||
                        x == 'U' || x == 'u' ) {
                        codes[i] += (int) x * names.length();
                } else {
                    codes[i] += (int) x / names.length();
                }
            }
        }

        int temp = 0;
        //Bubble Sort codes[n];
        for(int i=0; i < codes.length; i++){
            for(int j=1; j < (codes.length-i); j++){
                if(codes[j-1] > codes[j]){
                    //swap elements
                    temp = codes[j-1];
                    codes[j-1] = codes[j];
                    codes[j] = temp;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(codes[i]);
        }
    }
}
