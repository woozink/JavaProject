package java_constructor;
//파라미터가 없는 생성자
//클래스에는 생성자가 없으면 자동으로 초기 생성자를 만듭니다.

public class InitConstructor {
    public static void main(String[] args) {
        Bike1 b = new Bike1();
    }
}
class Bike1{
    Bike1(){
        System.out.println("Bike is created");
    }
}