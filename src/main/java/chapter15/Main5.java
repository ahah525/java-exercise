package chapter15;

public class Main5 {
    public static void main(String[] args) {
        int res = Calc.getMultipleThreeSum(30, 400);
        System.out.println("res = " + res);
    }
}
class Calc {
    // 3의 배수의 합
    public static int getMultipleThreeSum(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            if(i % 3 == 0) sum += i;
        }
        return sum;
    }
}
