package learn.something.bridge.function;

import learn.something.bridge.impl.DisplayImpl;

/**
 * 类的功能层次结构，子类通过继承增加新功能
 * <p>
 * Refined Abstraction Role, 在 Abstraction 的基础上增加新功能
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public final void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
