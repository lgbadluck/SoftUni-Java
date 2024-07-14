package _05_PolymorphismLab._03_Animals;

public class Dog extends Animal {
    public Dog(String name, String food) {
        super(name, food);

    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();
        sb.append("I am ").append(name).append(" and my favourite food is ").append(favouriteFood)
                .append(System.lineSeparator()).append("DJAAF");
        return sb.toString().trim();
    }
}
