package generic;

public class GenericPrinter<T extends Material> {
    private T material; // T자료형으로 선언한 변수

    public void setMaterial(T Material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }
}
