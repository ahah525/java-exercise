package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        ar.remove(2);
        int value = ar.get(2);
        System.out.println(value);
        // 출력 : 400

        ar.remove(0);
        value = ar.get(0);
        System.out.println(value);
        // 출력 : 200

        ar.add(78);
        value = ar.get(2);
        System.out.println(value);
        // 출력 : 78
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

    public void remove(int index) {
        // 삭제할 수 없는 인덱스 예외처리
        if (index > idx) {
            return;
        }
        // 한개씩 앞으로 당겨오고 마지막 인덱스 번호 1개 감소
        for (int i = index + 1; i <= idx; i++) {
            arr[i - 1] = arr[i];
        }
        idx--;
    }
}
