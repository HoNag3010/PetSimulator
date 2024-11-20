import java.util.ArrayList;

public class ActivityPrinter {
    public static void printActivities(ArrayList<ArrayList<String>> activities) {
        if (activities == null || activities.isEmpty()) {
            System.out.println("Nothing to display.");
            return;
        }
        for (int i = 0; i < activities.size(); i++) {
            System.out.println("Hour " + (i + 1));
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