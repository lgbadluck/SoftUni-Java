package MapsLambdaStreamAPIsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> userParkedCarInfoMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            String[] input = scanner.nextLine().split(" ");

            String command = input[0];
            String username = input[1];


            if (command.equals("register")) {
                String licensePlateNumber = input[2];
                if(userParkedCarInfoMap.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                } else {
                    userParkedCarInfoMap.put(username, licensePlateNumber);
                    System.out.println(username + " registered " + licensePlateNumber + " successfully");
                }
            } else if (command.equals("unregister")) {
                if(!userParkedCarInfoMap.containsKey(username)) {
                    System.out.println("ERROR: user " + username + " not found");
                } else {
                    userParkedCarInfoMap.remove(username);
                    System.out.println(username + " unregistered successfully");
                }
            }

            n--;
        }

        for (Map.Entry<String, String> entry : userParkedCarInfoMap.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
