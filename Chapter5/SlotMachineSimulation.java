/**
 * Owen Valasek
 * CH5PC21 - SlotMachineSimulation
 * Programming III - AP CS
 * 11/30/18
 */
import java.util.Scanner;
import java.util.Random;
public class SlotMachineSimulation {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int slot1 = 0;
        int slot2 = 0;
        int slot3 = 0;
        int money = 0;
        int fruit = 0;
        int count;
        String answer = "";
        do{
        System.out.println("Please insert an amount of money.");
        money = keyboard.nextInt();
        for(count = 0; count < 3; count++) {
            fruit = r.nextInt(5);
            
        if(fruit == 0) {
            System.out.println("cherries");
        }else if(fruit == 1){
                System.out.println("oranges");
        }else if(fruit == 2){
            System.out.println("plums");
        }else if(fruit == 3){
            System.out.println("bells");
        }else if(fruit == 4){
            System.out.println("melons");
        }else if(fruit == 5){
            System.out.println("bars");
        }
        if(slot1 < 1) {
            slot1 = fruit;
        }else if(slot2 < 1){
            slot2 = fruit;
        }if(slot3 < 1)
            slot3 = fruit;
        }
        if(slot1 == slot2 || slot2 == slot3 || slot1 == slot3){
            money = money * 2;
            System.out.println("You have doubled your money.");
        }else if (slot1 == slot2 && slot2 == slot3){
            money = money * 3;
            System.out.println("You have tripled your money!");
        }else if(slot1 != slot2 || slot1 != slot3 || slot2 != slot3){
            System.out.println("You have won no money.");
        }
        System.out.println("Would you like to play again?");
        answer = keyboard.next();
        
        }while(answer.equalsIgnoreCase("yes"));

        
        

        }

} 
    


