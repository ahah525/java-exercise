package chapter19;

public class Main2 {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println(calc.add(10, 20));
    }
}
class Calc {

    public int add(int a, int b) {

        return a + b;
    }

}
