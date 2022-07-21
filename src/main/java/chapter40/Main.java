package chapter40;

/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setListener(new 사람());
        button.click();
        button.setListener(new 강아지());
        button.click();
    }
}

interface Listener {
    public void listen(String msg);
}

class 사람 implements Listener {

    public void 안녕() {
        System.out.println("사람::안녕!");
    }

    @Override
    public void listen(String msg) {
        안녕();
    }
}

class 강아지 implements Listener {
    public void 안녕() {
        System.out.println("강아지::안녕!");
    }

    @Override
    public void listen(String msg) {
        안녕();
    }
}

// button에 관찰자
class Button {
    private Listener listener;
    public void click() {
        listener.listen("버튼 클릭됨!");
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}

