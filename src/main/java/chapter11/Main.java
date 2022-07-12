package chapter11;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 20;
        human.arm = new Arm();
    }
}
class Human {
    int age;
    Arm arm;

}
class Arm {
}
