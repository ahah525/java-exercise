package chapter32;

//code.oa.gg/java8/1350
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.

public class Main {
    public static void main(String[] args) {
        저장소<Integer> a저장소 = new 저장소<>();

        a저장소.setData(30);
        int a = a저장소.getData();

        System.out.println(a);

        저장소<Double> b저장소 = new 저장소<>();

        b저장소.setData(5.5);
        double b = b저장소.getData();

        System.out.println(b);


        저장소<사과> c저장소 = new 저장소<>();

        c저장소.setData(new 사과());
        사과 c = c저장소.getData();

        System.out.println(c);
    }
}

class 저장소<T> {
    Object data;

    T getData() {
        return (T)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class 사과 {

}