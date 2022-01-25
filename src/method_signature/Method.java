package method_signature;
// 간단한 메서드 에제
// 메소드를 생성하기 위한 규칙들 중 메소드의 이름과 파라미터만을 메소들의 시그니처 하고 한다.
public class Method {
    public static int Plus (int a, int b){
        return a+b;
    }
    public static int Minus(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        int result = Plus(3,4);
        System.out.println(result);

        result = Minus(5,2);
        System.out.println(result);
    }
}
