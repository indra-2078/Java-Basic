import java.util.*;
import java.math.*;

public class loggg {
    public static  void log(){
        Scanner se = new Scanner(System.in);
        System.out.println("Which value do you want to find out:\n Type 'N' for the solution of the power of a number\n Type 'a' to find the base value\n Type 'x' to find out the exponent Value");
        String z = se.nextLine();
        if(z.equals("n") || z.equals("N")){
            System.out.print("Enter the value of a: ");
            int a = se.nextInt();
            System.out.print("Enter the value of x: ");
            int x = se.nextInt();
            int w = 1;
            for(int i =0;i<x;i++){
                w = w*a;
            }
            System.out.println("Therefor the value of N is "+w);
        }
            else if(z.equals("a") || z.equals("A")){
                System.out.print("Enter the value of N: ");
                double a = se.nextInt();
                System.out.print("Enter the value of x: ");
                int x = se.nextInt();
                double r = Math.pow(a, 1.0/x);
                System.out.println(r);
            

        }
        else if(z.equals("x") || z.equals("X")){
            System.out.print("Enter the value of N: ");
            double a = se.nextInt();
            System.out.print("Enter the value of x: ");
            int x = se.nextInt();
            double r = Math.pow(a, 1.0/x);
            System.out.println(r);
        

    }
        
    }
    public static void main(String[] args) {
        log();
    }
}
