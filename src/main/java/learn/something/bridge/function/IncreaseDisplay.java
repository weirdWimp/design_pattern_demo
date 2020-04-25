package learn.something.bridge.function;

import learn.something.bridge.impl.DisplayImpl;

public class IncreaseDisplay extends CountDisplay {

    private int step;

    public IncreaseDisplay(DisplayImpl display, int step) {
        super(display);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }


}
