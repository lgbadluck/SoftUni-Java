package _03_InheritanceExercise._04_NeedForSpeed;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(125, 100);
        System.out.println("Before Vehicle has fuel: " + vehicle.getFuel());
        vehicle.drive(100);
        System.out.println("After Vehicle has fuel: " + vehicle.getFuel());

        Car car = new Car(125, 200);
        System.out.println("Before Vehicle has fuel: " + car.getFuel());
        car.drive(100);
        System.out.println("After Vehicle has fuel: " + car.getFuel());

        Car car1 = new Car(300, 200);
        System.out.println("Before Vehicle has fuel: " + car1.getFuel());
        car1.drive(100);
        System.out.println("After Vehicle has fuel: " + car1.getFuel());
    }
}
