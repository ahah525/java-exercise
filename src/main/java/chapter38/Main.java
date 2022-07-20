package chapter38;

//code.oa.gg/java8/1079
// 문제 : 아래코드가 실행되도록 해주세요.
// 조건 : 사람 객체의 수는 3을 넘을 수 없습니다.

class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[7];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();
        사람들[5] = 사람.get사람();
        사람들[6] = 사람.get사람();
//        System.out.println(사람들[2]);
//        System.out.println(사람들[3]);

        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }

		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		*/
    }
}

class 사람 {
    private static final int 최대_사람수;
    private static int 현재_사람수;
    private static 사람 마지막_사람;   // 마지막에 생성된 사람 객체의 리모컨

    private int 번호;

    // static 요소 전용 생성자
    static {
        최대_사람수 = 3;
        현재_사람수 = 0;
        마지막_사람 = null;
    }

    private 사람(int 번호) {
        this.번호 = 번호;
    }

    public static 사람 get사람() {
        if(현재_사람수 < 최대_사람수){
            사람 사람 = new 사람(++현재_사람수);
            마지막_사람 = 사람;
        }
        return 마지막_사람;
    }

    public void 자기소개() {
        System.out.printf("저는 %d번째 사람입니다.\n", 번호);
    }
}

