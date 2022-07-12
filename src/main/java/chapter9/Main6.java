package chapter9;

public class Main6 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.attack("브라이언이", "칼");
        warrior.attack("필립이", "창");
        warrior.reAttack();
        warrior.attack("마크", "지팡이");
        warrior.reAttack();
    }
}
class Warrior {
    private String name;
    private String weapon;
    public void attack(String name, String weapon){
        System.out.println(name + "가 " + weapon + " 공격");
        this.name = name;
        this.weapon = weapon;

    }
    public void reAttack(){
        System.out.println(this.name + "가 " + this.weapon + " 재공격");
    }
}


