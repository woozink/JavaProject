package java_constructor;
// 초기값을 보여주는 생성자 예시
public class InitConstructor2 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.id = 21;
        s1. name = "kim woo jin";
        s1.display();
        s2.display();
    }
}

class Student3 {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

}