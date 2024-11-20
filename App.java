import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Huy Hoang Nguyen
 * This program simulates what your pets do in the given hour
 */
public class App {
    public static void main(String[] args) {
        printHeading();         
        int hoursCount;
        PetSimulator simulator = new PetSimulator();        // Declare the simulator

        Scanner scan = new Scanner(System.in);              // Ask user for names and hours
        System.out.print("Enter the dog's name: ");
        String dogName = scan.nextLine();
        System.out.print("Enter the cat's name: ");
        String catName = scan.nextLine();
        System.out.print("Enter the fish's name: ");
        String fishName = scan.nextLine();

        System.out.println("\nNow let's simulate.");
        do {        // do.. while loop to loop until user tells 0 or less
            System.out.print("How many hours of their lives would you like to play out? ");
            hoursCount = scan.nextInt();
            if (hoursCount > 0) {
                simulator.addPet(new Dog(dogName));         // Add their name to simulator
                simulator.addPet(new Cat(catName));
                simulator.addPet(new Fish(fishName));
                ArrayList<ArrayList<String>> activites = simulator.simulate(hoursCount);        // Store their actions in the ArrayList

                System.out.println("Here's what the rascals did ...");
                ActivityPrinter.printHourlyActivities(activites);           // Print everything out
                
            }
        } while (hoursCount > 0);
        scan.close();
        System.out.println("Thank you for using this program.");
    }

    /**
     * This function prints the welcome banner
     */
    public static void printHeading() {
        System.out.println("\n******************************************************************************");
        System.out.println("Welcome to Pet Simulator. This tool simulates the activities of three kinds of\npets: dogs, cats, and fish. Each pet may sleep, eat and seek your attention\nfor some part of the day. And each pet will do things specific to what kind of\npet they are.");
        System.out.println("******************************************************************************");
        System.out.println("");
    }
}
