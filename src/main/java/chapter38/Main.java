package chapter38;

//code.oa.gg/java8/1077
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[5];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();

        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }

		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 4번째 사람입니다.
		저는 5번째 사람입니다.
		*/
    }
}

class 사람 {
    private static int lastId;
    private int id;

    // static 요소 전용 생성자
    static {
        lastId = 0;
    }

    private 사람(int id) {
        this.id = id;
    }

    public static 사람 get사람() {
        return new 사람(++lastId);
    }

    public void 자기소개() {
        System.out.printf("저는 %d번째 사람입니다.\n", id);
    }
}

