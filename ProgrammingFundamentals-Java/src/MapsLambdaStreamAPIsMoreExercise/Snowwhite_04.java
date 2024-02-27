package MapsLambdaStreamAPIsMoreExercise;

import java.util.*;

public class Snowwhite_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Dwarf, Integer> dwarfMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Once upon a time")) {
            String dwarfName = input.split("<:>")[0].trim();
            String dwarfHatColor = input.split("<:>")[1].trim();
            Integer dwarfPhysics = Integer.parseInt(input.split("<:>")[2].trim());

            Dwarf dwarfToAdd = new Dwarf(dwarfName, dwarfHatColor);

            dwarfMap.putIfAbsent(dwarfToAdd, 0);
            if (dwarfMap.containsKey(dwarfToAdd)) {
                if (dwarfPhysics > dwarfMap.get(dwarfToAdd))
                    dwarfMap.put(dwarfToAdd, dwarfPhysics);
            }

            input = scanner.nextLine();
        }

        // Calculate the frequency of each hat color
        Map<String, Integer> hatColorFrequency = new HashMap<>();
        for (Map.Entry<Dwarf, Integer> dwarf : dwarfMap.entrySet()) {
            String color = dwarf.getKey().getDwarfHatColor();
            hatColorFrequency.put(color, hatColorFrequency.getOrDefault(color, 0) + 1);
        }

        // Create a custom comparator
        Comparator<Map.Entry<Dwarf, Integer>> dwarfComparator = (dwarf1, dwarf2) -> {
            // Compare by Integer value
            int valueComparison = Integer.compare(dwarf2.getValue(), dwarf1.getValue());
            if (valueComparison != 0) {
                return valueComparison;
            }

            // If values are equal, compare by distinct string count
            //Set<String> distinctStrings1 = new HashSet<>(Arrays.asList(dwarf1.getKey().getDwarfHatColor().split(" ")));
            //Set<String> distinctStrings2 = new HashSet<>(Arrays.asList(dwarf2.getKey().getDwarfHatColor().split(" ")));
            //return Integer.compare(distinctStrings2.size(), distinctStrings1.size());

            Integer distStringCounts1 = hatColorFrequency.get(dwarf1.getKey().getDwarfHatColor());
            Integer distStringCounts2 = hatColorFrequency.get(dwarf2.getKey().getDwarfHatColor());

            //System.out.println("distStringCounts1: " + distStringCounts1);
            //System.out.println("distStringCounts2: " + distStringCounts2);
            return Integer.compare(distStringCounts2, distStringCounts1);
        };

        // Convert the HashMap entries to a list
        List<Map.Entry<Dwarf, Integer>> entryList = new ArrayList<>(dwarfMap.entrySet());

        // Sort the list using the custom comparator
        entryList.sort(dwarfComparator);

        entryList
                .forEach((dwarf) -> System.out.printf("(%s) %s <-> %d\n", dwarf.getKey().getDwarfHatColor(), dwarf.getKey().getDwarfName(), dwarf.getValue()));

    }

    public static class Dwarf {
        String dwarfName;
        String dwarfHatColor;

        public Dwarf(String dwarfName, String dwarfHatColor) {
            this.dwarfName = dwarfName;
            this.dwarfHatColor = dwarfHatColor;
        }

        public String getDwarfName() {
            return dwarfName;
        }

        public String getDwarfHatColor() {
            return dwarfHatColor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dwarf dwarf = (Dwarf) o;
            return Objects.equals(getDwarfName(), dwarf.getDwarfName()) && Objects.equals(getDwarfHatColor(), dwarf.getDwarfHatColor());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getDwarfName(), getDwarfHatColor());
        }

        @Override
        public String toString() {
            return "Dwarf{" +
                    "dwarfName='" + dwarfName + '\'' +
                    ", dwarfHatColor='" + dwarfHatColor + '\'' +
                    '}';
        }
    }
}
