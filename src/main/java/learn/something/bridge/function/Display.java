package learn.something.bridge.function;

import learn.something.bridge.impl.DisplayImpl;

/**
 * 类的功能层次结构
 * <p>
 * Abstraction Role 抽象化， 类的功能层次结构的最上层，使用 implementor 实现具体的功能
 */
public class Display {

    /**
     * 委托实现层次的类，实现具体的功能
     */
    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
