package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _01_TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // QUEUE -> offer()
        ArrayDeque<Integer> toolsQueue = new ArrayDeque<>();
        fillArrayDeque(scanner, toolsQueue::offer);


        // STACK -> push()
        ArrayDeque<Integer> substanceStack = new ArrayDeque<>();
        fillArrayDeque(scanner, substanceStack::push);

        // QUEUE -> offer()
        ArrayDeque<Integer> challengeQueue = new ArrayDeque<>();
        fillArrayDeque(scanner, challengeQueue::offer);

        while (!toolsQueue.isEmpty() && !substanceStack.isEmpty()) {
            int tool = toolsQueue.poll();
            int substance = substanceStack.pop();
            int result = tool*substance;
            if (challengeQueue.contains(result)) {
                challengeQueue.remove(result);
            }
            else {
                tool++;
                toolsQueue.offer(tool);
                substance--;
                if(substance!=0) {
                    substanceStack.push(substance);
                }
            }
            if(challengeQueue.isEmpty()) {
                break;
            }
        }
        if(!challengeQueue.isEmpty()){
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }
        else {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }
        if(!toolsQueue.isEmpty()) {
            System.out.println("Tools: " +
                    toolsQueue.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")) );
        }
        if(!substanceStack.isEmpty()) {
            System.out.println("Substances: " +
                    substanceStack.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")) );
        }
        if(!challengeQueue.isEmpty()) {
            System.out.println("Challenges: " +
                    challengeQueue.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")) );
        }


    }

    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(insertion);
    }
}
