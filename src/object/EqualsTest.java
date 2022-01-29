package object;

import jdk.swing.interop.SwingInterOpUtils;

class Student{
    int studentId;
    String studentName;

    public Student (int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public String toString() {
        return studentId + " , " + studentName;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentId == std.studentId){return true;}
            else return false;

        }
        return false;
    }
    @Override
    public int hashCode(){
        return studentId;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2){
            System.out.println("studentLee와 2의 주소는 같습니다.");
        }
        else{
            System.out.println("주소는 다릅니다.");
        }
        if(studentLee.equals(studentLee2)){
            System.out.println("Lee와 Lee2는 동일한놈임");
        }
        else{
            System.out.println("Lee와 Lee2는 다름");
        }



        if(studentLee == studentSang){
            System.out.println("studentLee와 Sang의 주소는 같습니다.");
        }
        else{
            System.out.println("주소는 다릅니다.");
        }
        if(studentLee.equals(studentSang)){
            System.out.println("Lee와 Sang는 동일한놈임");
        }
        else{
            System.out.println("Lee와 Sang는 다름");
        }

        System.out.println("StudentLee의 hashCode : " + studentLee.hashCode());
        System.out.println("StudentSang의 hashCode : " + studentSang.hashCode());

        System.out.println("StudentLee의 실제주소값 : " + System.identityHashCode(studentLee));
        System.out.println("StudentSang의 실제주소값 : " + System.identityHashCode(studentSang));



    }
}
