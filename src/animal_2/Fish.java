package animal_2;

public class Fish extends Animal implements Swimable {
    public Fish(int x, int y, int age){
        super(x,y,age,"Fish");
    }

    @Override
    public void swimDown(int yDistance){
        setY(getY() - yDistance);
    }
    public void attack(){
        System.out.println("물대포");
    }
    public void bark(){
        System.out.println("잉어킹");
    }
}

