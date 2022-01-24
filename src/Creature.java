//public abstract class Creature {
//    private int x;
//    private int y;
//    private int age;
//
//    public Creature(int x, int y, int age) {
//        this.age = age;
//        this.x = x;
//        this.y = y;
//    }
//
//    public void age() {
//        age++;
//    }
//
//    public void move(int xDistance) {
//        x += xDistance;
//    }
//
//    public int getX() {
//        return x;
//    }
//    public void setX(int x) {
//        this.x = x;
//    }
//    public int getY() {
//        return y;
//    }
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public abstract void attack();
//    public abstract void printInfo();
//
//    public String toString() {
//        return "x : " + x + ", y : " + y + ", age : " + age;
//    }
//}
//
//public abstract class Animal extends Creature{
//
//    public Animal(int x, int y, int age) {
//        super(x, y, age);
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("몸을 사용하여 공격!!");
//    }
//}
//public abstract class Human extends Creature implements Talkable{
//    public Human(int x, int y, int age) {
//        super(x, y, age);
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("도구를 사용!!");
//    }
//
//    @Override
//    public void talk() {
//        System.out.println("사람은 말을 할 수 있다.");
//    }
//}