package JavaAssignment1;

import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;
    public double area (int a,int b,int c){
        int largest_side =Math.max(a,Math.max(b,c));
        int smallest_side =Math.min(a,Math.min(b,c));
        int third = (a+b+c)-largest_side-smallest_side;
        if((smallest_side+third)>largest_side) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        }
        else {
            System.out.println("Invalid Sides of Triangle");
            System.exit(0);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        Triangle tri = new Triangle();
        System.out.println(tri.area(a,b,c));
    }
}
