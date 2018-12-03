/**
 * Owen Valasek
 * PC6 - Population
 * Programming III - AP CS
 * 11/28/18
 */
import java.util.Scanner;
public class Population {

    public static void main(String[] args) {
        double population = 0;
        double increase = 0.0;
        int days = 0;
        int count;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the population size of the organisms?");
        population = keyboard.nextInt();
        System.out.println("What is the population's daily population "
                + "increase in percent?");
        increase = keyboard.nextDouble();
        System.out.println("What is the number of days the population will "
                + "multiply?");
        days = keyboard.nextInt();
        PopulationIncrease Bird = new PopulationIncrease(population, increase,
                days);
        double p;
        double i;
        int d;
        System.out.println(Bird.dailyPopulation());
        
    }

}
