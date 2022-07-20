package test1;

// 100000보다 작은 자연수 중에서 3 또는 5의 배수 모두 더하기
public class Main1 {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1; i < 100000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
