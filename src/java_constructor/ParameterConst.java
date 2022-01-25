package java_constructor;

public class ParameterConst {
    public static void main(String[] args) {
        Student4 s1 = new Student4(111, "KAI");
        Student4 s2 = new Student4(123, "AIE");
        s1.display();
        s2.display();
    }
}

class Student4{
    int id;
    String name;

    Student4(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}