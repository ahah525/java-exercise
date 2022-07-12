package chapter12;

import org.w3c.dom.ls.LSOutput;

public class Main4 {
    public static void main(String[] args) {
        Warrior warriorA = new Warrior();
        String name = "칸";
        warriorA.name = name;
        warriorA.age = 20;
        warriorA.aboutMe();

        warriorA.age++;
        warriorA.aboutMe();

        warriorA.age = 30;
        warriorA.name = "카니";
        warriorA.aboutMe();

        warriorA.weapon = new Bow();
        warriorA.attack();

        warriorA.weapon = new Knife();
        warriorA.attack();
    }
}
class Warrior {
    String name;
    int age;
    Weapon weapon;

    void aboutMe() {
        System.out.println("안녕하세요. 저는 " + this.age + "살 " + this.name + " 입니다.");
    }

    public void attack() {
        weapon.userName = name;
        weapon.run();
    }
}

class Knife extends Weapon {
    public Knife() {
        name = "칼";
    }

    @Override
    void run() {
        System.out.println(userName + "가 " + name + "로 공격합니다");
    }
}
class Bow extends Weapon {
    public Bow() {
        name = "활";
    }

    @Override
    void run() {
        System.out.println(userName + "가 " + name + "로 공격합니다");
    }
}
abstract class Weapon {
    String userName;// 사용자명
    String name;    // 무기명

    abstract void run();
}
