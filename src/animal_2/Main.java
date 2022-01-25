package animal_2;

public class Main {
    public static void main(String[] args) {
        Fish fis = new Fish(100, -10, 10);
        fis.printInfo();
        fis.age();
        fis.move(-100);
        fis.printInfo();
        fis.attack();
        fis.swimDown(1000);
        fis.bark();
        fis.printInfo();

        System.out.println("-------------------");

        Dog dog = new Dog(100, 0, 6);
        dog.printInfo();
        dog.age();
        dog.move(-10);
        dog.attack();
        dog.bark();
        dog.printInfo();
    }
}
