package test1;

// 4자리수 2개를 곱해 만들 수 있는 가장 큰 대칭수
public class Main4 {
    public static void main(String[] args) {
        int num = 9999 * 9999;  // 대칭수 최댓값을 구하기 위해 최댓값부터 시작
        int res = 0;

        outer:
        while (true) {
            // 대칭수이면 4자리수 곱셈으로 만들 수 있는 수인지 검사
            if(isPalin(num)) {
                // 4자리수 최댓값=9999, 4자리수 최솟값=1000
                for (int a = 9999; a >= 1000; a--) {
                    if (num % a == 0) {
                        int b = num / a;
                        if(b < 10000) {
                            System.out.println(a + ", " + b);
                            res = num;
                            break outer;
                        }
                    }
                }
            }
            num--;
        }
        System.out.println(res);
    }
    public static boolean isPalin(int num) {
        String s = Integer.toString(num);
        for (int j = 0; j <= s.length() / 2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}
