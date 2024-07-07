package _04_InterfacesAndAbstractionExercise._04_FoodShortage;

public class Rebel implements Buyer, Person {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    public String getGroup(){
        return group;
    }
    @Override
    public int getFood() {
        return food;
    }
    @Override
    public void buyFood() {
        food+=5;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Rebel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", food=" + food +
                '}';
    }
}
