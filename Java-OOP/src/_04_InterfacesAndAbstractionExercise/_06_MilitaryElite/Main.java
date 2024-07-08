package _04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, SoldierImpl> mapOfSoldiers = new LinkedHashMap<>();

        String inputs = scanner.nextLine();

        while (!inputs.equals("End")) {
            String[] commandParts = inputs.split("\\s+");
            int id;
            String firstName;
            String lastName;
            double salary;
            Corps corp;

            switch (commandParts[0]) {
                case "Private":
                    id = Integer.parseInt(commandParts[1]);
                    firstName = commandParts[2];
                    lastName = commandParts[3];
                    salary = Double.parseDouble(commandParts[4]);
                    PrivateImpl soldier = new PrivateImpl(id, firstName, lastName, salary);
                    mapOfSoldiers.put(id, soldier);
                    break;
                case "LieutenantGeneral":
                    id = Integer.parseInt(commandParts[1]);
                    firstName = commandParts[2];
                    lastName = commandParts[3];
                    salary = Double.parseDouble(commandParts[4]);
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                    for (int i = 5; i < commandParts.length; i++) {
                        int currSoldierId = Integer.parseInt(commandParts[i]);
                        if (mapOfSoldiers.containsKey(currSoldierId)) {
                            PrivateImpl soldierToAdd = (PrivateImpl) mapOfSoldiers.get(currSoldierId);
                            lieutenantGeneral.addPrivate(soldierToAdd);
                        }
                    }
                    mapOfSoldiers.put(id, lieutenantGeneral);
                    break;
                case "Commando":
                    id = Integer.parseInt(commandParts[1]);
                    firstName = commandParts[2];
                    lastName = commandParts[3];
                    salary = Double.parseDouble(commandParts[4]);
                    corp = Corps.valueOf(commandParts[5]);
                    try {
                        CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corp);
                        for (int i = 6; i < commandParts.length; i += 2) {
                            String missionCodeName = commandParts[i];
                            MissionProgress missionState = MissionProgress.valueOf(commandParts[i + 1]);
                            try {
                                Mission mission = new Mission(missionCodeName, missionState);
                                commando.addMission(mission);
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        mapOfSoldiers.put(id, commando);
                    } catch (IllegalArgumentException e) {
                    }
                    break;
                case "Engineer":
                    id = Integer.parseInt(commandParts[1]);
                    firstName = commandParts[2];
                    lastName = commandParts[3];
                    salary = Double.parseDouble(commandParts[4]);
                    corp = Corps.valueOf(commandParts[5]);
                    try {
                        EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corp);
                        for (int i = 6; i < commandParts.length; i += 2) {
                            String partName = commandParts[i];
                            int hoursWorked = Integer.parseInt(commandParts[i + 1]);
                            Repair repair = new Repair(partName, hoursWorked);
                            engineer.addRepair(repair);
                        }
                        mapOfSoldiers.put(id, engineer);
                    } catch (IllegalArgumentException e) {
                    }
                    break;
                case "Spy":
                    id = Integer.parseInt(commandParts[1]);
                    firstName = commandParts[2];
                    lastName = commandParts[3];
                    String codeNumber = commandParts[4];
                    SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
                    mapOfSoldiers.put(id, spy);
                    break;
            }

            inputs = scanner.nextLine();
        }

        mapOfSoldiers.values().forEach(System.out::println);
    }
}
