package learn.something.bridge.impl;

/**
 * 类的实现层次结构，接口或抽象类定义接口 api
 * Implementor Role, 类的实现层次的最上层，定义了 Abstraction 中的接口
 */
public interface DisplayImpl {
    void rawOpen();

    void rawPrint();

    void rawClose();
}
