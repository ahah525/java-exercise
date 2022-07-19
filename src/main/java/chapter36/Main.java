package chapter36;

public class Main {
    public static void main(String[] args) {
        try {
            int rs = 계산기.나누다(10, 0);
            System.out.println(rs);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 에러 발생!");
        }
    }
}
class 계산기 {
    static int 나누다(int a, int b) throws ArithmeticException {
        int rs = a / b;
        return rs;
    }
}