package JavaAssignment1;

import java.util.Scanner;

class Circle{
    private double radius;
    private String color="red";
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea() {
        return Double.valueOf(String.format("%.2f",radius * radius * Math.PI));
    }
    public double getRadius() {
        return radius;
    }

}

public class CircleUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        //calling default constructor
        System.out.println("default constructor");
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());
        //calling parameterized constructor
        System.out.println("parameterized constructor");
        Circle circle2 = new Circle(radius);
        System.out.println(circle2.getArea());
    }
}
