package stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Test 15 lqlq 35 bad 99999 guess 34";

        // 1. 스트림 방식
        int sum1 = Arrays
                .stream(line.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        // 2. 일반 for문 방식
        String[] strings = line.split(" ");
        int sum2 = 0;
        for(String s : strings) {
            if(s.matches("\\d+")) {
                sum2 += Integer.parseInt(s);
            }
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
    public static void sum1() {

    }
}
