import java.util.Scanner;

public class hurr {
    public static void main(String[] args){
        while(true){
        try{Scanner se = new Scanner(System.in);
        System.out.println("Enter a number , you will get the corresponding alphabet:");
        int in = se.nextInt();
        char b= 'A';
        if(in == 0){
            System.out.println("0 is invalid");
        }
        else if(in<=26){
            b+=in-1;
            System.out.println("Your alphabet is: "+b);

        }
        else{
            System.out.println("There are only 26 letters in alphabets");
        }
    }
    catch(Exception e){
        System.out.println("Wrong input, Enter a number");
    }

    }
        
        
      }  }

