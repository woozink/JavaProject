//package Overriding;
//
//public class shape {
//    public static void main(String[] args) {
//        Shape[] shapes = new Shape[2];
//        Circle circle = new Circle();
//        Ambiguous ambiguous = new Ambiguous();
//
//        shapes[0] = circle;
//        shapes[1] = ambiguous;
//
//        for (Shape s : shapes) {
//            s.printMe();
//            System.out.println(s.computeArea());
//        }
//    }
//}
//
//
//public abstract class Shape {
//    public void printMe() {
//        System.out.println("Shape");
//    }
//
//    public abstract double computeArea();
//}
//
//public class Circle extends Shape {
//    private double rad = 5;
//
//    @Override
//    public void printMe() {
//        System.out.println("Circle");
//    }
//
//    public double computeArea() {
//        return rad * rad * 3.15;
//    }
//}
//
//public class Ambiguous extends Shape {
//    private double area = 10;
//
//    public double computeArea() {
//        return area;
//    }
//}


