package chapter27;

// 문제 : 아래와 같이 실행되게 해주세요.

public class Main1 {
    public static void main(String[] args) {
        IntArr intArr1 = new IntArr1();
        System.out.println("배열의 길이 : " + intArr1.length);
        // 출력 => 배열의 길이 : 1
        intArr1.setData(0, 20);
        System.out.println(intArr1.getData(0));
        // 출력 => 20

        IntArr intArr3 = new IntArr3();
        System.out.println("배열의 길이 : " + intArr3.length);
        // 출력 => 배열의 길이 : 3
        intArr3.setData(0, 20);
        intArr3.setData(1, 40);
        intArr3.setData(2, 60);
        System.out.println(intArr3.getData(0));
        // 출력 => 20
        System.out.println(intArr3.getData(1));
        // 출력 => 40
        System.out.println(intArr3.getData(2));
        // 출력 => 60
    }
}

abstract class IntArr {
    int length;

    abstract void setData(int index, int value);
    abstract int getData(int index);
}

class IntArr1 extends IntArr {
    int data0;

    IntArr1() {
        length = 1;
    }

    @Override
    void setData(int index, int value) {
        if (index == 0) {
            data0 = value;
        }
    }

    @Override
    int getData(int index) {
        return data0;
    }
}

class IntArr3 extends IntArr {
    int data0;
    int data1;
    int data2;

    IntArr3() {
        length = 3;
    }

    @Override
    void setData(int index, int value) {
        if (index == 0) {
            data0 = value;
        } else if (index == 1) {
            data1 = value;
        } else if (index == 2) {
            data2 = value;
        }
    }

    @Override
    int getData(int index) {
        if (index == 0) {
            return data0;
        } else if (index == 1) {
            return data1;
        } else if (index == 2) {
            return data2;
        }
        return 0;
    }
}