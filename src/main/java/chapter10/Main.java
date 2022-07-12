package chapter10;

public class Main {
    public static void main(String[] args) {
        SamsungTv samsungTv = new SamsungTv();
        LgTv lgTv = new LgTv();
        Tv tv;  // 표준 TV 리모컨

        // 표준 Tv 리모컨에 삼성 TV 객체에 연결
        tv = samsungTv;
        tv.turnOn();
        tv.turnOff();

        // 표준 TV 리모컨에 LG TV 객체에 연결
        tv = lgTv;
        tv.turnOn();
        tv.turnOff();
        // LG Tv 고유 기능을 표준 TV 리모콘으로 호출하기
        ((LgTv)tv).changeMode();
    }
}
class Tv {
    public void turnOn() {}
    public void turnOff() {}
}
class LgTv extends Tv {
    @Override
    public void turnOn() {
        System.out.println("LG TV가 켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV가 꺼집니다.");
    }

    public void changeMode() {
        System.out.println("LG TV 게임모드 전환!");
    }
}
class SamsungTv extends Tv {
    @Override
    public void turnOn() {
        System.out.println("삼성 TV가 켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성 TV가 꺼집니다.");
    }
}