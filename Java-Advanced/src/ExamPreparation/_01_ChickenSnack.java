package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ChickenSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> moneyAmountsStack = new ArrayDeque<>();
        // STACK -> push()
        fillArrayDeque(scanner, moneyAmountsStack::push);

        // QUEUE -> offer()
        ArrayDeque<Integer> pricesOfFoodsQueue = new ArrayDeque<>();
        fillArrayDeque(scanner, pricesOfFoodsQueue::offer);

        ArrayDeque<Integer> pocketChangeStack = new ArrayDeque<>();

        int countItemsAte = 0;
        while (!moneyAmountsStack.isEmpty() && !pricesOfFoodsQueue.isEmpty()) {
            int money = moneyAmountsStack.pop();
            int foodPrice = pricesOfFoodsQueue.poll();

            if (money >= foodPrice) {
                countItemsAte++;
                if (money > foodPrice) {
                    int change = money - foodPrice;
                    if (!moneyAmountsStack.isEmpty()) {
                        int nextAmount = moneyAmountsStack.pop();
                        moneyAmountsStack.push(change + nextAmount);
                    }
                }
            }
        }

        if (countItemsAte >= 4) {
            System.out.println("Gluttony of the day! Henry ate " + countItemsAte + " foods.");
        } else if (countItemsAte == 1) {
            System.out.println("Henry ate: 1 food.");
        } else if (countItemsAte > 1) {
            System.out.println("Henry ate: " + countItemsAte + " foods.");
        } else if (countItemsAte == 0) {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }

    }

    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(insertion);
    }
}

