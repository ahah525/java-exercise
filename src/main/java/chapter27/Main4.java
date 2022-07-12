package chapter27;

// 문제 : 길이가 10인 int 배열을 만들고 거기에 1부터 10까지 채워주세요.
// 조건 : 그 후 배열 안의 모든 값들의 합도 출력해주세요.

import java.util.Arrays;

class Main4 {
    public static void main(String[] args) {
        int[] arr = new int[10];    // 길이가 10인 int 배열
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        //System.out.println(Arrays.stream(arr).sum());
    }
}