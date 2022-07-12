package chapter16;

public class Main4 {
    public static void main(String[] args) {
        WarriorA warriorA = new WarriorA();
        warriorA.attack();

        WarriorB warriorB = new WarriorB();
        warriorB.attack();

        WarriorC warriorC = new WarriorC();
        warriorC.attack();

        WarriorD warriorD = new WarriorD();
        warriorD.attack();
    }
}

abstract class Warrior {
    Weapon weapon;  // 무기
    public void attack() {
        weapon.run();
    }
}
class WarriorA extends Warrior {
    public WarriorA() {
        weapon = new Knife();
    }
}
class WarriorB extends Warrior {
    public WarriorB() {
        weapon = new Knife();
    }
}
class WarriorC extends Warrior {
    public WarriorC() {
        weapon = new Bow();
    }
}
class WarriorD extends Warrior {
    public WarriorD() {
        weapon = new Bow();
    }
}
abstract class Weapon {
    String name;   // 이름

    public void run() {
        System.out.println(name + "(으)로 공격합니다.");
    }
}
class Bow extends Weapon {
    public Bow() {
        name = "활";
    }
}
class Knife extends Weapon {
    public Knife() {
        name = "칼";
    }
}

