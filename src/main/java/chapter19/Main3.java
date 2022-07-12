package chapter19;

public class Main3 {
    public static void main(String[] args) {
        new Apple();
        new Grape();
        new Person("홍길동");
        new Person();
    }
}
class Apple {
}
class Grape {
}
class Person {
    String name;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
