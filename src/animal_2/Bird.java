package animal_2;

public abstract class Bird extends Animal implements Flyable {
    public Bird(int x, int y, int age) {
        super(x, y, age);
    }
    @Override
    public void attack() {
        System.out.println("새 공격 ~");
    }
    @Override
    public void Flyable(){
        System.out.println("새는 날수 있다~");
    }
}
interface Flyable{
    abstract void Flyable();
}

