package learn.something.bridge;

import learn.something.bridge.function.CountDisplay;
import learn.something.bridge.impl.StringDisplayImpl;

/**
 * Bridge 模式：将类的 "功能层次结构“ 与 “实现层次结构” 分离，有利于独立的对它们进行扩展。
 * <p>
 * 想象在不同操作系统上的功能，如换行，不同操作系统的换行字符表示是不一样的，因此，就可以将换行这个接口定义在
 * Implementor Role 中，不同的操作系统就是不同的 Concrete Implementor Role。
 */
public class BridgeMain {

    public static void main(String[] args) {
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Love is a good thing."));
        countDisplay.multiDisplay(10);
    }
}
