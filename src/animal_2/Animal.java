package animal_2;

public abstract class Animal {
    private int x;
    private int y;
    private int age;

    public Animal(int x, int y, int age) {
        this.age = age;
        this.x = x;
        this.y = y;
    }

    public void age() {
        age++;
    }

    public void move(int xDistance) {
        x += xDistance;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void attack();
    public abstract void bark();
    public abstract void printInfo();

    @Override
    public String toString(){
        return "x : " + x + ", y : " + y + ", age : " + age;
    }
}
