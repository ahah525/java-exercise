package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        for ( int i = 0; i < 100; i++ ) {
            ar.add((i + 1) * 10);
        }

        int ar_size = ar.size(); // ar_size의 값은 100 이어야 합니다.

        for ( int i = 0; i < ar_size; i++ ) {
            int value = ar.get(i);
            System.out.println(value);
        }
    }
}
class ArrayList {
    int[] arr;
    int idx = -1;    // 마지막 인덱스 번호

    public ArrayList() {
        arr = new int[3];   // 여기변경불가
    }

    public int get(int index) {
        return arr[index];
    }

    public void add(int v) {
        if(idx + 1 >= arr.length) {
            // 기존 배열의 2배 크기인 새로운 배열
            int[] newArr = new int[arr.length * 2];
            // 새로운 배열로 기존 배열 복사하기
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[++idx] = v; // 배열에 삽입
    }

    public int size() {
        return idx + 1;
    }
}
