import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputnumber;
    public int numberofguess=0;


  Game(){
   Random rand = new Random();
   this.number = rand.nextInt(100);

    }
    void takeuserinput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrectnumber(){
        numberofguess++;
    if(inputnumber==number){
        System.out.printf("correct, you have taken %d attempts to guess the number right",numberofguess);
    return true;
                }
        else if ( inputnumber<number) {System.out.println("low , try a higher value");}
        else if (inputnumber>number) {System.out.println("high, try a lower value");}
return false;
    }

}


public class number_guessing {
    public static void main(String[] args) {
        Game g = new Game();
         boolean b = false;
    
        while(!b){
        g.takeuserinput();
       b= g.iscorrectnumber();
       //System.out.println(b);
    }
    }
}
