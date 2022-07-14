package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300

        value = ar.get(3);
        System.out.println(value);
        // 출력 : 400
    }
}
class ArrayList {
    int[] arr;
    int idx = 0;    // 넣어야할 인덱스 번호

    public ArrayList() {
        arr = new int[3];   // 여기변경불가
    }

    public int get(int index) {
        return arr[index];
    }

    public void add(int v) {
        if(idx >= arr.length) {
            // 기존 배열의 2배 크기인 새로운 배열
            int[] newArr = new int[arr.length * 2];
            // 새로운 배열로 기존 배열 복사하기
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[idx++] = v; // 배열에 삽입
    }
}
