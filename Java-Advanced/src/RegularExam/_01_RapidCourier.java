package RegularExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_RapidCourier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> packagesStack = new ArrayDeque<>();
        ArrayDeque<Integer> couriersCapacityQueue = new ArrayDeque<>();

        // Стек -> добавяме - .push()  | премахваме/вземаме последният .pop()
        // Опашка -> добавяме - .offer()  | премахваме/вземаме първият .poll()

        // Пълня един ред от конзолата с цели числа в СТЕК
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(packagesStack::push);
        // Пълня един ред от конзолата с цели числа в ОПАШКА
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(couriersCapacityQueue::offer);

        int totalWeightDelivered = 0;

        while (!packagesStack.isEmpty() && !couriersCapacityQueue.isEmpty()) {
            int lastPackageWeight = packagesStack.pop();
            int firstCourierCapacity = couriersCapacityQueue.poll();

            if (firstCourierCapacity >= lastPackageWeight) {
                // Does the delivery
                totalWeightDelivered+=lastPackageWeight;
                if (firstCourierCapacity > lastPackageWeight) {
                    // Reduced the Capacity by x2 the Pacage Weight
                    firstCourierCapacity -= lastPackageWeight*2;
                    if(firstCourierCapacity>0) {
                        //If the new courier's capacity is positive, the courier moves at the back of the sequence with the updated capacity.
                        couriersCapacityQueue.offer(firstCourierCapacity);
                    }
                }
            }
            else {
                // Courier cannot deliver the package
                // Subtract the courier's capacity from the package's weight
                // ◦ Return the remaining weight to the sequence (on its initial position), and remove the courier.
                // ◦ Add the delivered portion of the package's weight to the total delivered weight.
                lastPackageWeight-=firstCourierCapacity;
                packagesStack.push(lastPackageWeight);
                totalWeightDelivered+=firstCourierCapacity;
            }
        }

        System.out.printf("Total weight: %d kg\n", totalWeightDelivered);

        //If all the packages are delivered and there are no couriers left:
        if(packagesStack.isEmpty() && couriersCapacityQueue.isEmpty()) {
            System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
        }
        //If there are packages left but no more couriers available:
        else if (!packagesStack.isEmpty()) {
            ArrayDeque<Integer> packagesQueue = new ArrayDeque<>();
            for (Integer i : packagesStack) {
               packagesQueue.push(i);
            }
            String remainingPackages = packagesQueue.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Unfortunately, there are no more available couriers to deliver the following packages: %s\n", remainingPackages);
        }
        //If there are couriers left but there are no more packages to deliver:
        else if (!couriersCapacityQueue.isEmpty()) {
            String remainingCouriers = couriersCapacityQueue.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Couriers are still on duty: %s but there are no more packages to deliver.\n", remainingCouriers);
        }
    }
}
