public abstract class AbstractExecutor implements State{
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 0;

    // 추상메서드
    public abstract void run();

    // 일반 메서드 선언
    public void excute(){
        run();
        setState(true);
        System.out.println("execute");
    }


    // parent.change() 식으로 객체없이 인터페이스만으로도 호출이가능
    public interface Parent {
        public static void change() {
            System.out.println("상태를 변경합니다.");
        }
    }

    public static void main(String[] args) {
        // 상수필드
        SimpleExecutor simpleExecutor = new SimpleExecutor();
        simpleExecutor.excute();
    }
}
abstract class Animal {

}

interface Attackable {
    void attack();
}


class SimpleExecutor extends AbstractExecutor implements AbstractExecutor.Parent, State, Attackable {
    public void run () {
        System.out.println("Simple Run!");
    }


    @Override
    public void attack() {
        System.out.println("Attack!");
    }
}

interface State {
    //디폴트 메서드 <디폴트 키워드를 이용하여 작성한 메서드는 내용을 작성 가능하며 override 가능>
    public default void setState(boolean state) {
        if (state) {
            System.out.println("현재는 정상입니다.");
        } else {
            System.out.println("현재 비정상입니다.");
        }
    }
}