package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100, 0);
        ar.add(200, 1);
        ar.add(300, 2);
        ar.add(400, 3);
        ar.add(500, 4);
        ar.add(600, 2); // 2번좌석으로 새치기, 기존의 2번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.
        ar.add(700, 0); // 0번좌석으로 새치기, 기존의 0번좌석 손님부터 끝 손님까지 뒤로 한칸씩 밀린다.

        for ( int i = 0; i < ar.size(); i++ ) {
            int value = ar.get(i);

            System.out.println(i + " : " + value);
        }

        // 출력
        // 0 : 700
        // 1 : 100
        // 2 : 200
        // 3 : 600
        // 4 : 300
        // 5 : 400
        // 6 : 500
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

    public void add(int v, int index) {
        extendArrSize();
        idx++;
        // 뒤로 한칸식 밀고 마지막 인덱스 번호 1 증가
        for (int i = idx - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = v;
    }

    public void add(int v) {
        extendArrSize();
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
    // 배열 크기 2배 늘리기
    public void extendArrSize() {
        if(idx + 1 >= arr.length) {
            // 기존 배열의 2배 크기인 새로운 배열
            int[] newArr = new int[arr.length * 2];
            // 새로운 배열로 기존 배열 복사하기
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
}
