package JavaAssignment1;

import java.util.Scanner;

class Complex {
    private int real;
    private int imaginary;
    public Complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void print(){
        if(imaginary>=0){
            System.out.println(real+" + "+imaginary+"i");
        }
        else{
            System.out.println(real+" - "+(imaginary*-1)+"i");
        }

    }
    public Complex sum(Complex c1){
        Complex c3 = new Complex(this.real+c1.real,this.imaginary+c1.imaginary);
        return c3;
    }
    public Complex difference(Complex c1){
        Complex c3 = new Complex(this.real-c1.real,this.imaginary-c1.imaginary);
        return c3;
    }
    public Complex product(Complex c1){
        Complex c3= new Complex((this.real*c1.real)-(this.imaginary*c1.imaginary),this.real*c1.imaginary+c1.real*this.imaginary);
        return c3;
    }
}
public class ComplexUse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of first separated by space");
        int real1 = scan.nextInt();
        int imaginary1 = scan.nextInt();
        System.out.println("Enter the real and imaginary parts of second separated by space");
        int real2 = scan.nextInt();
        int imaginary2 = scan.nextInt();
        Complex c1 = new Complex(real1,imaginary1);
        Complex c2 = new Complex(real2,imaginary2);
        Complex c3= c1.sum(c2);
        c3.print();
        c3=c2.difference(c1);
        c3.print();
        c3=c1.product(c2);
        c3.print();
    }
}
