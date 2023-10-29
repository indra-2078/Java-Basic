import java.util.Random;
import java.util.Scanner;

class Game{
    int compnum;
    int inpnum;
    int noOfGuesses = 0;
    Game(){
        Random rand = new Random();
        compnum = rand.nextInt(100);
    }
    // public void setNoOfGuesses(int noOfGuesses) {
    //     this.noOfGuesses = noOfGuesses;
    // }
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner se = new Scanner(System.in);
        inpnum = se.nextInt();
        }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(compnum==inpnum){
                System.out.printf("The Guess was right (%d) and was guessed in %d attempts..\n",compnum,noOfGuesses);
                boolean b= false;
                return b = true;
        }
        else if(inpnum>compnum){
            System.out.println("Guess is Too High..");
        }
        else if(inpnum<compnum){
            System.out.println("Guess is Too low..");
        }
        return false;
        }
}


public class game1 {
     
        public static void main(String[] args) {
            Game g = new Game();
            boolean b= false;
            while(!b){
            g.takeUserInput();
            g.isCorrectNumber();
            }
                
        }
}
