package JavaAssignment1;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public void display(){
        System.out.println(this.width+" "+this.height);
    }
}

public class RectangleArea extends Rectangle{
    public void read_input(){
        Scanner s = new Scanner(System.in);
        super.width=s.nextInt();
        super.height=s.nextInt();
    }

    @Override
    public void display() {
        System.out.println(width*height);
    }

    public static void main(String[] args) {
        RectangleArea area = new RectangleArea();
        area.read_input();
        System.out.println(area.width+" "+area.height);
        area.display();
    }
}
