
import java.util.ArrayList;
import java.util.Random;


public class Dog extends Pet {
    private int needFetch;

    public Dog(String name) {
        super(name);

    }
    @Override
    public String getType() {
        return "dog";
    }
    @Override
    public void initializeCutoffs() {
        setNeedFood(4);
        setNeedSleep(7);
        setNeedAttention(9);
        needFetch = 6;
    }
    @Override
    public ArrayList<String> act() {
        ArrayList<String> result = super.act();
        int decider = new Random().nextInt(10);
        if (decider < needFetch) {
            result.add("The " + getType() + ", " + getName() + "played fetch.");
        }
        return result;
    }
}
