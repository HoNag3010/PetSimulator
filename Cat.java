import java.util.ArrayList;
import java.util.Random;

public class Cat extends Pet {
    private int needScratch;

    /**
     * Make an constructor class
     * @param name is the name user input
     */
    public Cat(String name) {
        super(name);
        initializeCutoffs();

    }
    @Override
    /**
     * Based on its type, return the correct type
     */
    public String getType() {
        return "cat";
    }
    @Override
    /**
     * This to initialize cut off and override the one on from superclass
     */
    public void initializeCutoffs() {
        setNeedFood(6);
        setNeedSleep(8);
        setNeedAttention(2);
        needScratch = 4;
    }
    @Override

    /**
     * This function is to store the action the pet did
     */
    public ArrayList<String> act() {
        ArrayList<String> result = super.act();
        int decider = new Random().nextInt(10);
        if (decider < needScratch) {
            result.add("The " + getType() + ", " + getName() + " scratched the kitty post");
        }
        return result;
    }
}
