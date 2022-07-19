package chapter32;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.add(50, 1);

        al.remove(0);

        System.out.println(al);

        System.out.println(al.get(3));  //40

        System.out.println(al.indexOf(50));     // 0
        System.out.println(al.contains(40));    // true

        System.out.println(al.get(3) + al.get(3));  // 80

        ArrayList<Double> al2 = new ArrayList<Double>();
        al2.add(10.5);
        al2.add(3.14);
        System.out.println(al2);
    }
}

class ArrayList<T> {
    private Object[] arr;
    private int size;

    public ArrayList() {
        arr = new Object[2];
        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        add(value, size);
    }

    public void add(T value, int index) {
        sizeUp();
        // 뒤에서부터 땡기기
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void remove(int index) {
        // 앞으로 땡기기
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    // 자동 확장
    public void sizeUp() {
        // 현재
        if (size >= arr.length) {
            // 2배 늘린 배열에 값 복사하기
            Object[] newArr = new Object[arr.length * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (((T) arr[i]).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (((T) arr[i]).equals(value)) {
                return true;
            }
        }
        return false;
    }
}