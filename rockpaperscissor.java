import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        Random rand = new Random();
        while(true){
            System.out.println("Enter:\n 0 for rock \n 1 for paper\n 2 for scissor");
            int userinp = se.nextInt();
            if(userinp<3){
                int compinp = rand.nextInt(3);
                if(userinp==compinp){
                    System.out.println("Match has Drawn");
                }
                else if(userinp==0 && compinp==2 || userinp==1 && compinp==0 || userinp==2 && compinp==1 ){
                    System.out.format("The computer chose %d So you Won",compinp);
                }
                else{
                    System.out.format("The computer chose %d So Computer Won",compinp);
                }
                }
            else{
                System.out.println("Invalid Input!");
            }

        } 
    }
}
