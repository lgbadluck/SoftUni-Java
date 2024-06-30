package _03_InheritanceLab._03_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        randomArrayList.add(15);
        randomArrayList.add(26);
        randomArrayList.add(37);
        randomArrayList.add(48);
        randomArrayList.add(59);

        randomArrayList.forEach(System.out::println);
        Object randomObj = randomArrayList.getRandomElement();
        System.out.println("-=RandomObj is=- -> " + randomObj);

        randomArrayList.remove(randomObj);

        randomArrayList.forEach(System.out::println);

    }
}
