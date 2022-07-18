package chapter34;

//code.oa.gg/java8/1345
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 구현 시작 ~ 구현 끝 사이 부분만 수정할 수 있습니다.
// 힌트 : instanceof

public class Main {
    public static void main(String[] args) {
        진찰하다(new 사람());
        // 출력 : 사람이 진찰합니다.
        진찰하다(new 원숭이());
        // 출력 : 원숭이가 진찰합니다.
        진찰하다(new 치타());
        // 출력 : 치타가 진찰합니다.
        진찰하다(new 기린());
        // 출력 : 기린이 진찰합니다.
        진찰하다(new 로봇());
        // 출력 : 로봇이 진찰합니다.
        진찰하다(new 삼성());
        // 출력 : 삼성이 진찰합니다.
    }

    public static void 진찰하다(의사 a의사) {
        a의사.진찰();
    }
}

interface 의사 {
    void 진찰();
}

class 사람 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("사람이 진찰합니다.");
    }
}

class 원숭이 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("원숭이가 진찰합니다.");
    }
}

class 치타 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("치타가 진찰합니다.");
    }
}

class 기린 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("기린이 진찰합니다.");
    }
}

class 로봇 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("로봇이 진찰합니다.");
    }
}

class 삼성 implements 의사 {

    @Override
    public void 진찰() {
        System.out.println("삼성이 진찰합니다.");
    }
}