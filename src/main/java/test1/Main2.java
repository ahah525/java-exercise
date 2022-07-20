package test1;

// 피보나치 수열에서 50000000이하이면서 짝수인 항의 합
public class Main2 {
    public static void main(String[] args) {
        final int MAX = 50000000;
        long prev1 = 1;
        long prev2 = 2;
        long cur = 0;
        long sum = 2;

        while (true) {
            cur = prev1 + prev2;
            if(cur > MAX)
                break;
            if(cur % 2 == 0){
                sum += cur;
            }
            //System.out.println(cur);
            prev1 = prev2;
            prev2 = cur;
        }
        System.out.println(sum);
    }
}
