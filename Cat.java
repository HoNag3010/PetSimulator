
import java.util.ArrayList;
import java.util.Random;


public class Cat extends Pet {
    private int needScratch;

    public Cat(String name) {
        super(name);

    }
    @Override
    public String getType() {
        return "cat";
    }
    @Override
    public void initializeCutoffs() {
        setNeedFood(6);
        setNeedSleep(8);
        setNeedAttention(2);
        needScratch = 4;
    }
    @Override
    public ArrayList<String> act() {
        ArrayList<String> result = super.act();
        int decider = new Random().nextInt(10);
        if (decider < needScratch) {
            result.add("The " + getType() + ", " + getName() + "scratched the kitty post");
        }
        return result;
    }
}
