import java.util.ArrayList;
import java.util.Random;

public abstract class Pet {
    private String name;
    private Random brain;
    private int needFood, needSleep, needAttention;
    public abstract void initializeCutoffs();
    public abstract String getType();

    public Pet(String name) {
        this.name = name;
        this.brain = new Random();
    }

    public String getName() {
        return name;
    }

    public void setNeedFood(int needFood) {
        this.needFood = needFood;
    }

    public void setNeedSleep(int needSleep) {
        this.needSleep = needSleep;
    }

    public void setNeedAttention(int needAttention) {
        this.needAttention = needAttention;
    }

    /**
     * Generate a random integer to compare with their need to decide their act
     * @return their act if successfully took an action
     */
    public ArrayList<String> act() {
        ArrayList<String> actions = new ArrayList<String>();
        int decider;

        decider = brain.nextInt(10);
        if (decider < needFood) {
            actions.add("The " + getType() + ", " + name + " ate.");
        }
        decider = brain.nextInt(10);
        if (decider < needSleep) {
            actions.add("The " + getType() + ", " + name + " slept.");
        }
        decider = brain.nextInt(10);
        if (decider < needAttention) {
            actions.add("The " + getType() + ", " + name + " sought your attention.");
        }
        return actions;
    }
}