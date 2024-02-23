package MapsLambdaStreamAPIsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (keyMaterials.get("shards") < 250 && keyMaterials.get("fragments") < 250 && keyMaterials.get("motes") < 250) {
            if (inputList.isEmpty())
                inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            int materialQuantity;
            String materialName;
            if (inputList.size() >= 2) {
                materialQuantity = Integer.parseInt(inputList.remove(0));
                materialName = inputList.remove(0).toLowerCase();
            } else continue;
            if (materialName.equals("shards") || materialName.equals("fragments") || materialName.equals("motes")) {
                keyMaterials.put(materialName, keyMaterials.get(materialName) + materialQuantity);
            } else {
                if(!junkMaterials.containsKey(materialName)) {
                    junkMaterials.put(materialName, 0);
                }
                junkMaterials.put(materialName, junkMaterials.get(materialName) + materialQuantity);
            }
        }

        int shardsQuantity = keyMaterials.get("shards");
        int fragmentsQuantity = keyMaterials.get("fragments");
        int motesQuantity = keyMaterials.get("motes");

        if (shardsQuantity > fragmentsQuantity && shardsQuantity > motesQuantity) {
            System.out.println("Shadowmourne obtained!");
            keyMaterials.put("shards", keyMaterials.get("shards") - 250);
        }
        if (fragmentsQuantity > shardsQuantity && fragmentsQuantity > motesQuantity) {
            System.out.println("Valanyr obtained!");
            keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
        }
        if (motesQuantity > shardsQuantity && motesQuantity > fragmentsQuantity) {
            System.out.println("Dragonwrath obtained!");
            keyMaterials.put("motes", keyMaterials.get("motes") - 250);
        }

        for (Map.Entry<String, Integer> entry : keyMaterials.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkMaterials.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
