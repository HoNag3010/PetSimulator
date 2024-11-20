
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printHeading();   
        int hoursCount;
        PetSimulator simulator = new PetSimulator();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dog's name: ");
        String dogName = scan.nextLine();
        System.out.print("Enter the cat's name: ");
        String catName = scan.nextLine();
        System.out.print("Enter the fish's name: ");
        String fishName = scan.nextLine();

        System.out.println("Now let's simulate.");
        do { 
            System.out.print("How many hours of their lives would you like to play out? ");
            hoursCount = scan.nextInt();
            if (hoursCount > 0) {
                simulator.addPet(new Dog(dogName));
                simulator.addPet(new Cat(catName));
                simulator.addPet(new Fish(fishName));
                ArrayList<ArrayList<String>> activites = simulator.simulate(hoursCount);

                ActivityPrinter.printActivities(activites);
                
            }
        } while (hoursCount > 0);
       
        
    }

    public static void printHeading() {
        System.out.println("******************************************************************************");
        System.out.println("Welcome to Pet Simulator. This tool simulates the activities of three kinds of\npets: dogs, cats, and fish. Each pet may sleep, eat and seek your attention\nfor some part of the day. And each pet will do things specific to what kind of\npet they are.");
        System.out.println("******************************************************************************");
        System.out.println("");
    }
}
