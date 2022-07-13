package chapter28;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 23, "홍길동");
        Student s2 = new Student(1, 23, "홍길동");
        System.out.println(s1.equals(s2));  // true
    }
}
class Student {
    private int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student == false) {
            return false;
        }
        Student s = (Student)obj;
        if(this.id == s.id && this.age == s.age && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }
}
