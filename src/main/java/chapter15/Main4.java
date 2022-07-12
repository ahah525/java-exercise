package chapter15;

public class Main4 {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.name = "홍길동";

        soldier.aboutMe();
        soldier.attack();

        soldier.levelUp();
        soldier.aboutMe();
        soldier.attack();

        soldier.levelUp();
        soldier.aboutMe();
        soldier.attack();
    }
}
class Soldier {
    String name;   // 이름
    int level;  // 계급 번호

    public Soldier() {
        level = 1;
    }

    String getLevelName() {
        String levelName = "";
        if(level == 1) {
            levelName = "이병";
        } else if (level == 2) {
            levelName = "일병";
        } else if(level == 3) {
            levelName = "상병";
        }
        return levelName;
    }

    int getLevelPower() {
        int power = 0;  // 공격력
        if(level == 1) {
            power = 7;
        } else if (level == 2) {
            power = 9;
        } else if (level == 3) {
            power = 11;
        }
        return power;
    }
    public void aboutMe() {
        System.out.println("안녕하세요. 저는 " + name + " " + getLevelName() + " 입니다.");
    }
    public void levelUp() {
        level++;
    }
    public void attack() {
        System.out.println(name + " " + getLevelName() + "이 공격합니다.(공격력 : " + getLevelPower() + ")");
    }
}