package chapter39;

//code.oa.gg/java8/1081
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        오리 a청둥오리 = 오리공장.get("청둥");
        오리 a흰오리 = 오리공장.get("흰");
        오리 a고무오리 = 오리공장.get("고무");
        오리 a고무2오리 = 오리공장.get("고무2");
        오리 a로봇오리 = 오리공장.get("로봇");

        a청둥오리.날다();
        // 출력 : 청둥오리 : 날개로 날아갑니다.
        a청둥오리.울다();
        // 출력 : 청둥오리 : 꽥꽥!!

        a흰오리.날다();
        // 출력 : 흰오리 : 날개로 날아갑니다.
        a흰오리.울다();
        // 출력 : 흰오리 : 꽥꽥!!

        a고무오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무오리.울다();
        // 출력 : 고무오리 : 삑!삑!

        a고무2오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무2오리.울다();
        // 출력 : 고무오리 : Peek!Peek!

        a로봇오리.날다();
        // 출력 : 로봇오리 : 로켓파워로 날아갑니다!!
        a로봇오리.울다();
        // 출력 : 로봇오리 : 기계는 울 수 없습니다.

        a고무2오리.set비행아이템(new 로켓날개비행아이템());
        a고무2오리.날다();
        // 출력 : 고무오리 : 로켓파워로 날아갑니다!!
    }
}

interface 아이템 {
    public void 사용(String 종류);
}
interface 비행아이템 extends 아이템 {
}

class 날개비행아이템 implements 비행아이템 {
    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "날개로 날아갑니다.");
    }
}
class 로켓날개비행아이템 implements 비행아이템 {
    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "로켓파워로 날아갑니다!!");
    }
}
class 못나는비행아이템 implements 비행아이템 {
    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "저는 날 수 없어요. ㅠㅠ");
    }
}

interface 울음아이템 extends 아이템 {

}

class 꽥꽥울음아이템 implements 울음아이템 {

    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "꽥꽥!!");
    }
}
class 삑삑울음아이템 implements 울음아이템 {

    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "삑!삑!");
    }
}
class 픽픽울음아이템 implements 울음아이템 {

    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "Peek!Peek!");
    }
}
class 기계울음아이템 implements 울음아이템 {

    @Override
    public void 사용(String 종류) {
        System.out.println(종류 + " : " + "기계는 울 수 없습니다.");
    }
}
class 오리 {
    private String 종류;
    private 비행아이템 비행아이템;
    private 울음아이템 울음아이템;

    public 오리(String 종류) {
        this.종류 = 종류 + "오리";
    }

    public void set비행아이템(비행아이템 비행아이템) {
        this.비행아이템 = 비행아이템;
    }

    public 비행아이템 get비행아이템() {
        return 비행아이템;
    }

    public void set울음아이템(울음아이템 울음아이템) {
        this.울음아이템 = 울음아이템;
    }

    public 울음아이템 get울음아이템() {
        return 울음아이템;
    }

    public void 날다() {
        비행아이템.사용(종류);
    }

    public void 울다() {
        울음아이템.사용(종류);
    }
}

class 오리공장 {

    public static 오리 get(String 종류) {
        오리 오리 = new 오리(종류);
        switch (종류) {
            case "흰":
                오리.set비행아이템(new 날개비행아이템());
                오리.set울음아이템(new 꽥꽥울음아이템());
                break;
            case "청둥":
                오리.set비행아이템(new 날개비행아이템());
                오리.set울음아이템(new 꽥꽥울음아이템());
                break;
            case "고무":
                오리.set비행아이템(new 못나는비행아이템());
                오리.set울음아이템(new 삑삑울음아이템());
                break;
            case "고무2":
                오리.set비행아이템(new 못나는비행아이템());
                오리.set울음아이템(new 픽픽울음아이템());
                break;
            case "로봇":
                오리.set비행아이템(new 로켓날개비행아이템());
                오리.set울음아이템(new 기계울음아이템());
                break;
        }
        return 오리;
    }

}


