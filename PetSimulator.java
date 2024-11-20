import java.util.ArrayList;

public class PetSimulator {
    private ArrayList<Pet> pets;

    public PetSimulator() {
        pets = new ArrayList<Pet>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }
    
    public ArrayList<ArrayList<String>> simulate(int hoursCount) {
        ArrayList<ArrayList<String>> hourlyActivity = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < hoursCount; i++) {
            ArrayList<String> hoursActivities = new ArrayList<String>();
            
            for (Pet pet : pets) {
                ArrayList<String> actions = pet.act();
                hoursActivities.addAll(actions);
            }
            hourlyActivity.add(hoursActivities);
        }
        return hourlyActivity;
    }
}