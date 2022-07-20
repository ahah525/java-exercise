package test1;

// 1600851475143의 소인수 중에서 가장 큰 수
public class Main3 {
    public static void main(String[] args) {
        long n = 1600851475143L;
        long i = 2;

        while (n != 1) {
            if (n % i == 0) {
                n /= i;
                continue;
            }
            i++;
        }
        System.out.println(i);
    }
}
