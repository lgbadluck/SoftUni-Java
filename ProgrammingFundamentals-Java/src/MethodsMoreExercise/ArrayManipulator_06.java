package MethodsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] inputsSTR = scanner.nextLine().split(" ");

        while (!inputsSTR[0].equals("end")) {                       // E.g. [1, 2, 3, 4, 5]
            String cmd1 = inputsSTR[0];
            String cmd2 = "";
            String cmd3 = "";
            switch (cmd1) {
                case "exchange":
                    cmd2 = inputsSTR[1];
                    exchangeByIndex(Integer.parseInt(cmd2), arrayInt);                    //[1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
                    break;
                case "max":     //If a min/max even/odd element cannot be found, print "No matches".
                    cmd2 = inputsSTR[1];
                    if (cmd2.equals("even")) printIndexOfMaxEven(arrayInt); //[1, 4, 8, 2, 3] -> max even -> print 2
                    if (cmd2.equals("odd")) printIndexOfMaxOdd(arrayInt);   //[1, 4, 8, 2, 3] -> max odd -> print 4
                    break;
                case "min":     //If a min/max even/odd element cannot be found, print "No matches".
                    cmd2 = inputsSTR[1];
                    if (cmd2.equals("even")) printIndexOfMinEven(arrayInt); //[1, 4, 8, 2, 3] -> min even -> print 3
                    if (cmd2.equals("odd")) printIndexOfMinOdd(arrayInt);   //[1, 4, 8, 2, 3] -> min odd -> print 0
                    break;
                case "first":   //If the count is greater than the array length, print "Invalid count".
                    // If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
                    cmd2 = inputsSTR[1];
                    cmd3 = inputsSTR[2];
                    if (cmd3.equals("even"))
                        printFirstSeveralEven(Integer.parseInt(cmd2), arrayInt);   //[1, 8, 2, 3] -> first 2 even -> print [8, 2]
                    if (cmd3.equals("odd"))
                        printFirstSeveralOdd(Integer.parseInt(cmd2), arrayInt);     //[1, 8, 2, 3] -> first 2 odd -> print [1, 3]
                    break;
                case "last":   //If the count is greater than the array length, print "Invalid count".
                    // If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
                    cmd2 = inputsSTR[1];
                    cmd3 = inputsSTR[2];
                    if (cmd3.equals("even"))
                        printLastSeveralEven(Integer.parseInt(cmd2), arrayInt);   //[1, 8, 2, 3] -> first 2 even -> print [8, 2]
                    if (cmd3.equals("odd"))
                        printLastSeveralOdd(Integer.parseInt(cmd2), arrayInt);     //[1, 8, 2, 3] -> first 2 odd -> print [1, 3]
                    break;
                default:
            }


            inputsSTR = scanner.nextLine().split(" ");
        }
        printArrayElements(arrayInt);
    }

    public static void exchangeByIndex(int index, int[] arrayInput) { // [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
        int temp = 0;

        if (index>= arrayInput.length || index<0) {
            System.out.println("Invalid index");
            return;
        }

        for (int j = 0; j <= index; j++) {
            temp = arrayInput[0];
            for (int i = 0; i < arrayInput.length - 1; i++) {
                arrayInput[i] = arrayInput[i + 1];
            }
            arrayInput[arrayInput.length - 1] = temp;
        }
    }

    public static void printFirstSeveralEven(int count, int[] arrayInput) {
        int len = arrayInput.length;
        if (count > len) {
            System.out.println("Invalid count");
            return;
        }
        int matchIdx = 0;
        int[] firstMatchIdx = new int[len];
        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 == 0) {
                firstMatchIdx[matchIdx++] = arrayInput[i];
            }
        }
        int endIdx = -1;
        System.out.print("[");
        if (matchIdx >= count) {
            endIdx = count-1;
        } else if (matchIdx < count) {
            endIdx = matchIdx-1;
        }
        for (int i = 0; i <= endIdx; i++) {
            System.out.print(firstMatchIdx[i]);
            if (i == endIdx) break;
            else System.out.print(", ");
        }

        System.out.print("]\n");
    }

    public static void printFirstSeveralOdd(int count, int[] arrayInput) {
        int len = arrayInput.length;
        if (count > len) {
            System.out.println("Invalid count");
            return;
        }
        int matchIdx = 0;
        int[] firstMatchIdx = new int[len];
        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 != 0) {
                firstMatchIdx[matchIdx++] = arrayInput[i];
            }
        }
        int endIdx = -1;
        System.out.print("[");
        if (matchIdx >= count) {
            endIdx = count-1;
        } else if (matchIdx < count) {
            endIdx = matchIdx-1;
        }
        for (int i = 0; i <= endIdx; i++) {
            System.out.print(firstMatchIdx[i]);
            if (i == endIdx) break;
            else System.out.print(", ");
        }

        System.out.print("]\n");
    }

    public static void printLastSeveralEven(int count, int[] arrayInput) {
        int len = arrayInput.length;
        if (count > len) {
            System.out.println("Invalid count");
            return;
        }

        int matchIdx = 0;
        int[] firstMatchIdx = new int[len];
        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 == 0) {
                firstMatchIdx[matchIdx++] = arrayInput[i];
            }
        }
        int startIdx = -1;
        System.out.print("[");
        if (matchIdx >= count) {
            startIdx = matchIdx - count;
        } else if (matchIdx < count) {
            startIdx = 0;
        }
        for (int i = startIdx; i < len; i++) {
            if (matchIdx!=0) System.out.print(firstMatchIdx[i]);
            if (i >= matchIdx-1 || i == len - 1) break;
            else System.out.print(", ");
        }

        System.out.print("]\n");
    }

    public static void printLastSeveralOdd(int count, int[] arrayInput) {
        int len = arrayInput.length;
        if (count > len) {
            System.out.println("Invalid count");
            return;
        }

        int matchIdx = 0;
        int[] firstMatchIdx = new int[len];
        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 != 0) {
                firstMatchIdx[matchIdx++] = arrayInput[i];
            }
        }
        int startIdx = -1;
        System.out.print("[");
        if (matchIdx >= count) {
            startIdx = matchIdx - count;
        } else if (matchIdx < count) {
            startIdx = 0;
        }
        for (int i = startIdx; i < len; i++) {
            if (matchIdx!=0) System.out.print(firstMatchIdx[i]);
            if (i >= matchIdx-1 || i == len - 1) break;
            else System.out.print(", ");
        }

        System.out.print("]\n");
    }

    public static void printIndexOfMaxEven(int[] arrayInput) { //[1, 4, 8, 2, 3] -> max even -> print 2
        int len = arrayInput.length;
        int max = Integer.MIN_VALUE;
        int matchIdx = -1;
        boolean foundMatch = false;

        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 == 0) {
                foundMatch = true;
                if (arrayInput[i] >= max) {
                    matchIdx = i;
                    max = arrayInput[i];
                }
            }
        }
        //printArrayElements(arrayInput);
        if (foundMatch) System.out.printf("%d\n", matchIdx);
        else System.out.println("No matches");
    }

    public static void printIndexOfMaxOdd(int[] arrayInput) {
        int len = arrayInput.length;
        int max = Integer.MIN_VALUE;
        int matchIdx = -1;
        boolean foundMatch = false;

        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 != 0) {
                foundMatch = true;
                if (arrayInput[i] >= max) {
                    matchIdx = i;
                    max = arrayInput[i];
                }
            }
        }
        //printArrayElements(arrayInput);
        if (foundMatch) System.out.printf("%d\n", matchIdx);
        else System.out.println("No matches");
    }

    public static void printIndexOfMinEven(int[] arrayInput) {
        int len = arrayInput.length;
        int min = Integer.MAX_VALUE;
        int matchIdx = -1;
        boolean foundMatch = false;

        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 == 0) {
                foundMatch = true;
                if (arrayInput[i] <= min) {
                    matchIdx = i;
                    min = arrayInput[i];
                }
            }
        }
        //printArrayElements(arrayInput);
        if (foundMatch) System.out.printf("%d\n", matchIdx);
        else System.out.println("No matches");
    }

    public static void printIndexOfMinOdd(int[] arrayInput) {
        int len = arrayInput.length;
        int min = Integer.MAX_VALUE;
        int matchIdx = -1;
        boolean foundMatch = false;

        for (int i = 0; i < len; i++) {
            if (arrayInput[i] % 2 != 0) {
                foundMatch = true;
                if (arrayInput[i] <= min) {
                    matchIdx = i;
                    min = arrayInput[i];
                }
            }
        }
        //printArrayElements(arrayInput);
        if (foundMatch) System.out.printf("%d\n", matchIdx);
        else System.out.println("No matches");
    }

    public static void printArrayElements(int[] arrayInput) {
        int len = arrayInput.length;

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(arrayInput[i]);
            if (i == len - 1) {
                System.out.print("]\n");
            } else System.out.print(", ");
        }
    }
}
