package chapter15;

public class Main789 {
    public static void main(String[] args) {
        Warrior warrior = new Dong();
        warrior.weapon = new Bow();
        warrior.attack();

        warrior = new Sun();
        warrior.attack();

        warrior.weapon = new Spear();
        warrior.attack();
    }
}
abstract class Warrior {
    String name;    // 이름
    Weapon weapon;  // 무기

    public Warrior() {
        // 디폴트 칼으로 생성
        this.weapon = new Knife();
    }

    public void attack() {
        weapon.run(name);
    }
}
class Dong extends Warrior {
    public Dong() {
        name = "홍길동";
    }
}
class Sun extends Warrior {
    public Sun() {
        name = "홍길순";
    }
}
abstract class Weapon {
    String name;

    public void run(String name) {
        System.out.println(name + "이(가) " + this.name + "(으)로 공격합니다.");
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
class Spear extends Weapon {
    public Spear() {
        name = "창";
    }
}

