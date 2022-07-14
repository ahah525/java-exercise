package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.removeAt(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3).intValue() + al.get(4).intValue()));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}
class ArrayList {
    private Object[] arr;   // Object 배열
    private int size;    // 크기

    public ArrayList() {
        arr = new Object[2];
        size = 0;
    }

    // ArrayList에 삽입된 데이터의 개수
    public int size() {
        return size;
    }
    // 맨 끝에 데이터 삽입
    public void add(int v) {
        add(v, size);
    }
    // 해당 인덱스에 데이터 삽입
    public void add(int v, int idx) {
        autoSizeUp();
        // 끝에서부터 한개씩 뒤로 다 밀기
        for (int i = size - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = v;   // 해당 값을 인덱스에 넣기
        size++; // 배열 개수 1 증가
    }
    // 인덱스로 조회
    public Integer get(int idx) {
        return (Integer) arr[idx];
    }
    public void removeAt(int idx) {
        // 삭제한 값 이후 값들 한개씩 앞으로 당기기
        for (int i = idx + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--; // 배열 개수 1 감소
    }
    // 배열의 길이 자동 증가
    public void autoSizeUp() {
        // 이미 배열이 꽉차있으면 배열 크기로 2배로 늘리기
        if (size >= arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            // 크기를 2배 늘린 배열로 기존 배열 값 복사
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            System.out.printf("배열의 크기가 증가되었습니다. %d => %d\n", arr.length, newArr.length);
            arr = newArr;
        }
    }
    // 전체 데이터 출력
    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d\n", i, arr[i]);
        }
    }
}
