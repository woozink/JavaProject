package animal_2;

// Java Constructor
// Java Method Signature
// Java Overloading / Overriding

public abstract class Animal {
    private int x;
    private int y;
    private int age;
    private String type;

    public Animal(int age, String type) {
        this.x=0;
        this.y=0;
        this.age = age;
        this.type = type;
    }

    public Animal(int x, int y, int age, String type) {
        this.age = age;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void age() {
        age++;
    }

    public void move(int xDistance) {
        x += xDistance;
    }

    public int getX() {
        return x;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void attack();
    public abstract void bark();

    public void printInfo(){
        System.out.println(type + toString());
    }

    @Override
    public String toString(){
        return "x : "+ x + ", y : " + y + ", age : " + age;
    }
}
