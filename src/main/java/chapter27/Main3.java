package chapter27;

// 문제 : 사람 리모콘 3개 저장할 수 있는 배열을 만들고 사람 리모콘으로 채워주세요.

public class Main3 {
    public static void main(String[] args) {
        // 사람 리모컨 3개를 저장할 수 있는 배열 생성
        사람[] 사람들 = new 사람[3];
        // 사람 객체를 생성하고 리모컨을 저장
        사람들[0] = new 사람(1);
        사람들[1] = new 사람(2);
        사람들[2] = new 사람(3);

        사람들[0].자기소개();
        사람들[1].자기소개();
        사람들[2].자기소개();
    }
}
class 사람 {
    int 번호;

    public 사람(int 번호) {
        this.번호 = 번호;
    }
    public void 자기소개() {
        System.out.printf("저는 %d번 입니다.\n", 번호);
    }
}

