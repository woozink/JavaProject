package gameLevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빨리 달림");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돌아버림");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("******고급자 레벨이당********");
    }
}
