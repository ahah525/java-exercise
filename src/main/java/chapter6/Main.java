package chapter6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.speak();
        human.run();
    }
}
class Human {
    public Human() {
    }

    public void speak() {
        System.out.println("Human.speak");
    }
    public void run() {
        System.out.println("Human.run");
    }
}
