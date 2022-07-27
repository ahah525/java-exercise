package chapter43;


public class Main {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
    }
}

abstract class Activity {
    abstract public void onCreate();
}

class MainActivity extends Activity {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다.");

        View.OnClickListener a; // 이 코드가 실행되도록 해주세요.
    }
}

class View {
    public static interface OnClickListener {

    }
}




