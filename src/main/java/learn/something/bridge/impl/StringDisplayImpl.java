package learn.something.bridge.impl;

/**
 * 类的实现层次结构，子类或实现类通过实现具体方法实现接口 api
 * <p>
 * Concrete Implementor Role, 实现定义在 Implementor 中定义的接口
 */
public class StringDisplayImpl implements DisplayImpl {

    private String string;

    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
