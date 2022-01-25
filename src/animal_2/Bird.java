package animal_2;

public abstract class Bird extends Animal implements Flyable {
    public Bird(int x, int y, int age) {
        super(x, y, age, "Bird");
    }
    @Override
    public void attack() {
        System.out.println("새 공격 ~");
    }
    @Override
    public void fly(){
        System.out.println("새는 날수 있다~");
    }
}


