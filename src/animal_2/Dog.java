package animal_2;

public abstract class Dog extends Animal {
    public Dog (int x, int y, int age){
        super(x,y,age);
    }
    @Override
    public void attack(){
        System.out.println("몸통박치기!");
    }

}

