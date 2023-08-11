import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pan_card_validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pan card number");
        String pan_card_num = sc.nextLine();
       String x =  pan_card_num.toUpperCase();
        // System.out.println(x);
        x.length();
       Pattern pattern = Pattern.compile("[A-Z]{3}[P,C,H,A,F,T,B,L,J,G][A-Z]\\d{4}[A-Z]");
      // DQY P A 2555 R
   Matcher matcher = pattern.matcher(x);
        if(x.length() ==10 && matcher.matches()){
            System.out.println("This valid PAN Number "+ x);
            
        }
        else{
            
            System.out.println("Invalid");
        }
    
    }
}
