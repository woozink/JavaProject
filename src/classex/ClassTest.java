package classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();// 메서드 사용하기
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 클래스 파일 대입하기
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("classex.Person"); // 클래스의 이름으로 가져오기
        System.out.println(pClass3.getName());

    }
}
