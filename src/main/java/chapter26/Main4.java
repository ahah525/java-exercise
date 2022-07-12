package chapter26;

//code.oa.gg/java8/979
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요. 필요하다면 다른 클래스도 만들어보세요. 필요하다면 main 메서드도 수정해주세요.

public class Main4 {
    public static void main(String[] args) {
        저장소 a저장소 = new 저장소();

        int i = 10;
        Integer iObj = new Integer(i);
        a저장소.저장(iObj);
        iObj = (Integer)a저장소.주세요();
        i = iObj.intValue();

        System.out.println(i);
        // 출력 10

        사람 a사람1 = new 사람();
        a저장소.저장(a사람1);
        a사람1 = (사람)a저장소.주세요();
        a사람1.걷다();
        // 사람이 걷습니다.
    }
}
class 저장소 {
    Object value;
    public void 저장(Object value) {
        this.value = value;
    }
    public Object 주세요() {
        return this.value;
    }
}
class 사람 {
    public void 걷다() {
        System.out.println("사람이 걷습니다.");
    }
}
