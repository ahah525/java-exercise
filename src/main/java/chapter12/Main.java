package chapter12;

public class Main {
    public static void main(String[] args) {
        Human humanA = new Human();
        humanA.name = "김철수";
        humanA.phone = "010-1234-5678";
        humanA.store = new StoreA();
        humanA.level = "매운";
        humanA.food = "짬뽕";

        Human humanB = new Human();
        humanB.name = "김영희";
        humanB.phone = "010-4321-4321";
        humanB.store = new StoreB();
        humanB.level = "안매운";
        humanB.food = "짬뽕";

        humanA.order();
        humanB.order();

        humanB.store = humanA.store;
        humanB.level = "아주 매운";
        humanB.food = "짜짱";

        humanB.order();
    }
}
class Human {
    String name;
    String phone;
    Store store;
    String level;
    String food;

    public void order() {
        store.delibery(name, phone, level, food);
    }

}
abstract class Store {
    String name;
    abstract public void delibery(String name, String phone, String level, String food);
}
class StoreA extends Store {
    public StoreA() {
        this.name = "영화반점";
    }

    @Override
    public void delibery(String name, String phone, String level, String food) {
        System.out.println(this.name + "에서 " + name + "(" + phone + ")" + "에게 " + level + " " + food + "(을)를 배달합니다");
    }
}
class StoreB extends Store {
    public StoreB() {
        this.name = "북경반점";
    }

    @Override
    public void delibery(String name, String phone, String level, String food) {
        System.out.println(this.name + "에서 " + name + "(" + phone + ")" + "에게 " + level + " " + food + "(을)를 배달합니다");
    }
}
