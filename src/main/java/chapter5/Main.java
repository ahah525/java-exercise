package chapter5;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, 20);
        Car car2 = new Car(2, 40);

        car1.run();
        car2.run();
    }
}
class Car {
    private int id;
    private int speed;

    public Car(int id, int speed) {
        this.id = id;
        this.speed = speed;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println("id = " + id);
        System.out.println("speed = " + speed);
    }
}