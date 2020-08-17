package JavaAssignment1;

import java.util.Scanner;

public class Calculator {
    interface Add {
        void add(int a, int b);
    }

    interface Subtract {
        void difference(int a, int b);
    }

    interface Product {
        void product(int a, int b);
    }

    interface SafeDivision {
        void safeDivision(int a, int b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Calculator.Add plus =(int x,int y) -> {
            System.out.println(x+y);
        };
        Calculator.Subtract minus=(int x,int y)-> {
            System.out.println(x-y);
        };
        Calculator.Product multiply =(int x,int y)-> {
            System.out.println(x*y);
        };
        Calculator.SafeDivision divide=(int x, int y)->{
            try {
                if(y==0){
                    Exception e = new Exception();
                    throw e;
                }
                else {
                    System.out.println(x/y);
                }
            }
            catch (Exception e){
                System.out.println("Division by Zero");
            }
        };
        plus.add(a,b);
        minus.difference(a,b);
        multiply.product(a,b);
        divide.safeDivision(a,b);


    }
}
