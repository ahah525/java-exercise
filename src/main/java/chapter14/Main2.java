package chapter14;

public class Main2 {
    public static void main(String[] args) {
        Warriror warrirorA = new Warriror();
        warrirorA.age = 20;
        warrirorA.name = "칸";
        warrirorA.character = "차가움";
        warrirorA.weapon = new Bow();

        Warriror warrirorB = new Warriror();
        Warriror warrirorC = new Warriror();
        Warriror warrirorD = new Warriror();
        Warriror warrirorE = new Warriror();
        Warriror warrirorF = new Warriror();

        System.out.println(warrirorA.name);
        System.out.println(warrirorB.name);
        System.out.println(warrirorC.name);
        System.out.println(warrirorD.name);
        System.out.println(warrirorE.name);
        System.out.println(warrirorF.name);
    }
}
class Warriror {
    int age;
    String name;
    String character;   //  성격
    Weapon weapon;

    public Warriror() {
        this.name = "No Name";
    }
}
abstract class Weapon {
}
class Bow extends Weapon {

}
class Knife extends Weapon {

}
