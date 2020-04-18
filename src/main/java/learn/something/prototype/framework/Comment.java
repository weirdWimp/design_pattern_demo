package learn.something.prototype.framework;

/**
 * Prototype 模式， 原型模式，不根据类来生成实例，而是根据实例来生成新实例；适用于：
 *
 * 1. 对象种类繁多，无法整合到一个类中
 * 2. 难以根据类来生成实例时，用户绘制的图形界面的一个对象，难以通过类来生成一个相同属性的实例对象
 * 3. 解耦生成实例的框架于生成的实例，不依赖于具体的类
 *
 * Prototype Role: 负责定义复制现有实例生成新实例的方法， 即 createClone方法。
 * 实现了 Cloneable 接口，才可以调用 Object 中定义的 clone 方法，复制实例，
 * clone 为 protected， 只能在类自己（子类）中调用
 *
 */
public interface Comment extends Cloneable {

    void comment(String string);

    Comment createClone();

}
