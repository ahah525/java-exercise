package chapter11;

public class Main2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        String name = "칸";
        warrior.name = name;
        warrior.age = 20;
        warrior.aboutMe();

        warrior.age++;
        warrior.aboutMe();

        warrior.age = 30;
        warrior.name = "카니";
        warrior.aboutMe();

        warrior.weapon = new Bow();
        warrior.attack();

        warrior.weapon = new Knife();
        warrior.attack();
    }
}
class Warrior {
    int age;
    String name;
    Weapon weapon;

    public void aboutMe() {
        System.out.println("안녕하세요. 저는 " + this.age + "살" + this.name + "입니다.");
    }
    public void attack() {
        System.out.println(this.name + "가 " + weapon + "로 공격합니다.");
    }
}
class Weapon {
}
class Knife extends Weapon {
    @Override
    public String toString() {
        return "칼";
    }
}
class Bow extends Weapon {
    @Override
    public String toString() {
        return "활";
    }
}
