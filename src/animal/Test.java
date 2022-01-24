// Abstract Class: IS-A 관계 (ex. Animal-Dog)
// Interfact: HAS-A 관계, 어떤 기능을 가지고 있다 (ex. Attackable, Closable, Runnable)
// class: Animal(type, name, age) - Dog, Cat, Bird - 숨쉬다(Fish)
// interface: Attackable(Dog, Cat), Flyable(Bird), Barkable(Dog), Swimmable(Fish)
// getter / setter
package animal;

import java.util.List;

abstract class Animal {

    protected int age;
    protected String name;
    protected String type;

    public Animal(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    abstract void cry();

    public void breath() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

interface Flyable {
    void fly();
}

class Dog extends Animal {

    public Dog(int age, String name, String type) {
        super(age, name, type);
    }

    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Bird extends Animal implements Flyable {

    public Bird(int age, String name) {
        super(age, name, "Bird");
    }

    @Override
    void cry() {
        System.out.println("CHACK CHACK");
    }

    @Override
    public void fly() {
        System.out.println("FLY!!");
    }
}

class Cat extends Animal {
    public Cat(int age, String name, String type) {
        super(age, name, type);
    }

    @Override
    void cry() {
        System.out.println("NYA ONG");
    }
}


public class Test {
    static void start(Animal ani) {
        System.out.println(ani.getAge() + ani.getName() + ani.getType());
    }


    public static void main(String[] args) {
        Dog dog = new Dog(1, "강아지", "Dog");
        Bird bird = new Bird(2, "새");
        Bird bird2 = new Bird(1, "to2");
        Bird bird3 = new Bird(1, "새3");
        Cat cat = new Cat(3, "나비", "Cat");
        List<Animal> animals = List.of(dog, bird, bird2, bird3, cat);

        for(Animal animal: animals) {
            Test.start(animal);
            animal.cry();
        }
        Test.start(dog);
        Test.start(bird);
        Test.start(bird2);
        Test.start(bird3);
        Test.start(cat);

        bird.fly();
        bird2.fly();
    }
}