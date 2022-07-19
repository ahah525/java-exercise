package chapter37;

//code.oa.gg/java8/1069
// 문제 : 오류를 수정하세요.

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.setId(20);

        System.out.println("제 번호는 " + a사람.getId() + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class 사람 {
    private int id;

    public 사람() {
        id = 0;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

}

