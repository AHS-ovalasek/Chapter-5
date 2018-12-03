/**
 * Owen Valasek
 * Ch5PC19
 * Programming III - AP CS
 * 11/30/18
 */
import java.util.Scanner;
public class SquareDisplay {

    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int amount;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number 1-15");
        amount = keyboard.nextInt();
        

        for(count = 1; count <= amount; count++){
        for(count2 = 1; count2 <= amount; count2++){
            System.out.print("X");            

        
        }
            System.out.println("");
        }
        
        }
}
