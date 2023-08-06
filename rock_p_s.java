import java.util.Random;
import java.util.Scanner;
public class rock_p_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Enter 0 for Rock , 1 for paper , 2 for Scissor");
        var choice = sc.nextInt();
        // System.out.println("You choose"+ choice);
        if(choice==0 ){
            System.out.println("You choose Rock");
        }
        else if( choice==1){
            System.out.println("You choose Paper");
        }
        else if(choice==2){
            System.out.println("You choose Scissor");
        }
        else{
            System.out.println("Invalid input");
        }

        int r_num = rand.nextInt(2);
     
         if(r_num==0 ){
            System.out.println("Computer choose Rock");
        }
        else if( r_num==1){
            System.out.println("Computer choose Paper");
        }
        else if(r_num==2){
            System.out.println("Computer choose Scissor");
        }
        else{
            System.out.println("Invalid input");
            
        }

        if(choice==r_num){
            System.out.println("draw");
        }
            else if (choice ==0 && r_num==2 || choice==1 && r_num==0 || choice==2 && r_num==1 ){
                System.out.println("You win");
            }
            else{
                System.out.println("Computer won the match");
            }
            


    }
    
}
