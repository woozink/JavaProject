package java_constructor;

public class ContentVO {
    // 타이틀과 컨텐트라는 문자열 타입을 인스턴스 변수로 가지는 클래스
    private String title;
    private String content;

    public ContentVO(String title, String content) {
        super();
        // 상속을 받은 super class의 생성자를 가리키는 것이다. Object는 모든 클래스의 최상의 클래스로 extends 생략
        // 최상의 클래스인 object의 생성자이다.
        this.title = title;
        this.content = content;
    }

}
