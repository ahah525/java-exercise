package chapter14;

public class Main6 {
    public static void main(String[] args) {
        int length = new Person().leftArm.hand.thumb.length;

        System.out.println("엄지손가락 길이 = " + length + "cm");
    }
}
class Person {
    int age;
    Arm leftArm;

    public Person() {
        leftArm = new Arm();
        leftArm.hand = new Hand();
        leftArm.hand.thumb = new Thumb();
        leftArm.hand.thumb.length = 5;
    }
}
class Arm {
    Hand hand;
}
class Hand {
    Thumb thumb;
}
class Thumb {
    int length;
}
