package chapter40;

class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
interface Listener {

    public void onClick();
}
class Button {
    Listener listener;
    public void setClickEventListener(Listener listener) {
        this.listener = listener;
    }

    public void fireClick() {
        listener.onClick();
    }
}

class 고양이 implements Listener {
    @Override
    public void onClick() {
        clickResponse();
    }

    public void clickResponse() {
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 개 implements Listener {
    @Override
    public void onClick() {
        clickResponse();
    }

    public void clickResponse() {
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 부엉이 implements Listener {
    @Override
    public void onClick() {
        clickResponse();
    }

    public void clickResponse() {
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
