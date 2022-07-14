package chapter30;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}
class ArrayList {
    int[] arr = new int[100];
    int idx = 0;

    public int get(int index) {
        return arr[index];
    }

    public void add(int v) {
        arr[idx++] = v;
    }
}
