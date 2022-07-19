package chapter36;

public class Main {
    public static void main(String[] args) {
        int rs = 계산기.나누다(10, 0);
        System.out.println(rs);
    }
}
class 계산기 {
    static int 나누다(int a, int b) {
        int rs = 0;

        try {
            rs = a / b;
        }
        catch ( ArithmeticException e ) {
            rs = 0;
        }

        return rs;
    }
}