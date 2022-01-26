package gameLevel;

public class BeginnerLevel extends PlayerLevel{


    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump를 몰라");

    }

    @Override
    public void turn() {
        System.out.println("Turn을 몰라");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("******초보자 레벨입니다.*********");
    }
}
