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
class Button {
    Object listener;
    public void setClickEventListener(Object listener) {
        this.listener = listener;
    }

    public void fireClick() {
        if (listener instanceof 고양이) {
            ((고양이) listener).clickResponse();
        } else if (listener instanceof 개) {
            ((개) listener).clickResponse();
        } else if (listener instanceof 부엉이) {
            ((부엉이) listener).clickResponse();
        }
    }
}

class 고양이 {
    public void clickResponse() {
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 개 {
    public void clickResponse() {
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 부엉이 {
    public void clickResponse() {
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
