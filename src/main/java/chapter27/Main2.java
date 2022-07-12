package chapter27;

//code.oa.gg/java8/987

// 문제 : a와 b와 c를 저장하는 char 배열을 만들어주세요.

public class Main2 {
    public static void main(String[] args) {
        // 배열 초기화
        char[] arr = new char[]{'A', 'B', 'C'};
//        arr[0] = 'A';
//        arr[1] = 'B';
//        arr[2] = 'C';
        for (char c : arr) {
            System.out.println(c);
        }
    }
}

