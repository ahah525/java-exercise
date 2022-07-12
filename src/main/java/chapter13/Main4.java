package chapter13;

public class Main4 {
    public static void main(String[] args) {
        Office officeA = new Office();
        officeA.add("홍길순", 33);
        officeA.add("홍길동", 20);
        officeA.add("임꺽정", 30);

        Person personA = officeA.getPerson(1);
        personA.aboutMe();

        Person personB = officeA.getPerson(2);
        personB.aboutMe();

        Person personC = officeA.getPerson(3);
        personC.aboutMe();
    }
}
class Office {
    private int cnt = 0;    // 현재 추가된 사람수
    Person person;  // 처음 사람

    public void add(String name, int age) {
        Person person = new Person(cnt + 1, name, age);
        System.out.println("나이가 " + age + "살인 " + (cnt + 1) + "번째 사람(" + name + ")이 추가되었습니다.");
        cnt++;

        if(person.num == 1) {
            this.person = person;
        } else if(person.num >= 2) {
            // (person.num - 1)번호를 가진 사람의 nextPerson으로 방금 추가한 person 연결
            Person lastPerson = this.person;
            for(int i = 2; i < person.num; i++) {
                lastPerson = lastPerson.nextPerson;
            }
            lastPerson.nextPerson = person;
        }
    }
    // n번째 person 반환
    public Person getPerson(int n) {
        Person person = this.person;
        if(n >= 2) {
            for(int i = 2; i <= n; i++) {
                person = person.nextPerson;
            }
        }
        return person;
    }
}
class Person {
    int num;    // 번호
    String name;// 이름
    int age;    // 나이
    Person nextPerson;  // 다음 사람

    public Person(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public void aboutMe() {
        System.out.println("저는 " + num + "번, " + name + ", " + age + "살 입니다.");
    }
}
