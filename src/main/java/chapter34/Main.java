package chapter34;

//code.oa.gg/java8/894
// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 홍길동();
        변호사 a변호사 = (변호사)a사람;
        치과의사 a치과의사 = (치과의사)a사람;
        성화봉송자 a성화봉송자 = (성화봉송자)a사람;
    }
}


abstract class 사람 {

}
interface 변호사 {

}

interface 치과의사 {

}

interface 성화봉송자 {

}

class 홍길동 extends 사람 implements 변호사, 치과의사, 성화봉송자 {

}