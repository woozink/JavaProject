package animal_2;

public class Dog extends Animal {
    public Dog(int age, String type) {
        super(age, type);
    }

    public Dog(int x, int y, int age) {
        super(x, y, age,"Dog");
    }

    @Override
    public void attack() {
        System.out.println("몸통박치기!");
    }

    public void bark() {
        System.out.println("멍멍");
    }


}

