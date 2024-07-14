package _05_PolymorphismLab._03_Animals;

public class Cat extends Animal {
    public Cat(String name, String food) {
        super(name, food);

    }

    @Override
    public String explainSelf() {
        StringBuilder sb = new StringBuilder();
        sb.append("I am ").append(name).append(" and my favourite food is ").append(favouriteFood)
                .append(System.lineSeparator()).append("MEEOW");
        return sb.toString().trim();
    }
}
