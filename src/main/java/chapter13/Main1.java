package chapter13;

public class Main1 {
    public static void main(String[] args) {
        Warrior warriorA = new Warrior();

        warriorA.weaponLeft = new Knife();
        warriorA.attack();

        Warrior warriorB = new Warrior();
        warriorB.weaponLeft = new Spear();
        warriorB.weaponRight = new Ax();
        warriorB.attack();
    }
}
class Warrior {
    Weapon weaponLeft;
    Weapon weaponRight;
    public void attack() {
        if(weaponLeft != null) {
            weaponLeft.userHand = "왼손";
            weaponLeft.run();
        }
        if(weaponRight != null) {
            weaponRight.userHand = "오른손";
            weaponRight.run();
        }
    }
}
abstract class Weapon {
    String userHand;
    String name;
    abstract void run();
}
class Knife extends Weapon {
    public Knife() {
        name = "칼";
    }

    @Override
    void run() {
        System.out.println("전사가 " + userHand + "으로 " + name + "(을)를 사용합니다.");
    }
}
class Spear extends Weapon {
    public Spear() {
        name = "창";
    }

    @Override
    void run() {
        System.out.println("전사가 " + userHand + "으로 " + name + "(을)를 사용합니다.");
    }
}
class Ax extends Weapon {
    public Ax() {
        name = "도끼";
    }

    @Override
    void run() {
        System.out.println("전사가 " + userHand + "으로 " + name + "(을)를 사용합니다.");
    }
}