
import java.util.ArrayList;
import java.util.Random;


public class Fish extends Pet {
    private int needSwim;

    public Fish(String name) {
        super(name);
    initializeCutoffs();
    }
    @Override
    public String getType() {
        return "fish";
    }
    @Override
    public void initializeCutoffs() {
        setNeedFood(3);
        setNeedSleep(1);
        setNeedAttention(0);
        needSwim = 9;
    }
    @Override
    public ArrayList<String> act() {
        ArrayList<String> result = super.act();
        int decider = new Random().nextInt(10);
        if (decider < needSwim) {
            result.add("The " + getType() + ", " + getName() + " swam around its bowl.");
        }
        return result;
    }
}
