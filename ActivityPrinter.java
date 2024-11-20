import java.util.ArrayList;

public class ActivityPrinter {
    /**
     * This function takes the activites ArrayList and print everything inside it based on its size
     * @param activities is the ArrayList has every activites occured
     */
    public static void printHourlyActivities(ArrayList<ArrayList<String>> activities) {
        if (activities == null || activities.isEmpty()) {
            System.out.println("Nothing to display.");      // If there is nothing inside, this prints and ends program
            return;
        }
        for (int i = 0; i < activities.size(); i++) {       // For loop to print out everything inside the given list
            System.out.printf("\t\t\t*** Hour %d ***\n",(i + 1));
            ArrayList<String> thisHour = activities.get(i);
            if (thisHour.isEmpty()) {
                System.out.println("No activities for this hour.");
            } else {
                for (String act : thisHour) {
                    System.out.println(act);
                }
            }
        }
    }
}