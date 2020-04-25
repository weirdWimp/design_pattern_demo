package learn.something.bridge.function;

import learn.something.bridge.impl.DisplayImpl;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {

    private Random random = new Random(System.currentTimeMillis());

    private int maxCount;

    public RandomCountDisplay(DisplayImpl display, int maxCount) {
        super(display);
        this.maxCount = maxCount;
    }

    public void randomDisplay() {
        int count = random.nextInt(maxCount);
        multiDisplay(count);
    }
}
