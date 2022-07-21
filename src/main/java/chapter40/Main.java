package chapter40;

/*
문제 : Main 객체의 안녕이 Main클래스가 아닌 다른 클래스 객체에 의해 실행되도록 해주세요.
*/
class Main {
    public static void main(String[] args) {
        Main aMain = new Main();

        실행자 a실행자 = new 실행자();
        a실행자.set리모콘(aMain);
        a실행자.리모콘_작동();
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}

class 실행자 {
    private Object a리모콘;

    public void set리모콘(Object a리모콘) {
        this.a리모콘 = a리모콘;
    }

    public void 리모콘_작동() {
        // 수정가능지역 시작
        if (a리모콘 instanceof Main) {
            ((Main) a리모콘).안녕();
        }
        // 수정가능지역 끝
    }
}
