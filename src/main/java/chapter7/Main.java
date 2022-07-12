package chapter7;

public class Main {
    public static void main(String[] args) {
        System.out.println("청둥오리");
        BlueDuck blueDuck = new BlueDuck();
        blueDuck.fly();
        blueDuck.swim();

        System.out.println("흰오리");
        WhiteDuck whiteDuck = new WhiteDuck();
        whiteDuck.fly();
        whiteDuck.swim();

        System.out.println("고무오리1");
        RubberDuckA rubberDuckA = new RubberDuckA();
        rubberDuckA.fly();
        rubberDuckA.swim();

        System.out.println("고무오리2");
        RubberDuckB rubberDuckB = new RubberDuckB();
        rubberDuckB.fly();
        rubberDuckB.swim();

        System.out.println("로봇오리");
        RobotDuck robotDuck = new RobotDuck();
        robotDuck.fly();
        robotDuck.swim();
    }
}
class BlueDuck extends Duck { }
class WhiteDuck extends Duck { }
class RubberDuckA extends Duck {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
    @Override
    public void swim() {
        System.out.println("오리가 물에 둥둥 떠다닙니다.");
    }
}
class RubberDuckB extends RubberDuckA {
}
class RobotDuck extends Duck {
    @Override
    public void swim() {
        System.out.println("오리가 물에 둥둥 떠다닙니다.");
    }
}
class Duck {
    public void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void swim() {
        System.out.println("오리가 물갈퀴로 수영합니다.");
    }
}
