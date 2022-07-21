package chapter40;

// 문제 : 아래가 실행되도록 해주세요.

class Main implements OnClickListener {
    public static void main(String[] args) {
        Main aMain = new Main();
        View aButton = new Button(aMain);

        aButton.setOnClickListener(aMain);
        aButton.fireClickEvent();
        // 출력 : 버튼이 클릭되었습니다.
        // 참고로 위 출력은 아래 onClick 메서드의 호출로 이뤄져야 합니다.
    }

    @Override
    public void onClick(View v) {
        System.out.println("버튼이 클릭되었습니다.");
    }
}

interface OnClickListener {
    public void onClick(View v);
}

interface View {
   public void setOnClickListener(OnClickListener listener);
   public void fireClickEvent();
}

class Button implements View {
    OnClickListener listener;

    public Button(OnClickListener listener) {
        this.listener = listener;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void fireClickEvent() {
        listener.onClick(this);
    }
}