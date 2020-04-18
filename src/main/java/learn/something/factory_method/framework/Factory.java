package learn.something.factory_method.framework;

/**
 * Factory Method 模式， 工厂方法模式，使用模板方法模式，决定实例的生成方式，但并不决定所要生成的具体的类，
 * 具体的处理交由子类来完成
 * <p>
 * Factory Creator          ---(create)--->    Product
 * Concrete Factory Creator ---(create)--->    Concrete Product
 */
public abstract class Factory {

    /**
     * Template method 模板方法模式
     *
     * @return
     */
    public final Product create(String id) {
        Product product = createProduct(id);
        registerProduct(product);
        return product;
    }

    /**
     * 实际生成实例的方法，由子类来实现，每一个专用的实现生成一个实现子类对象
     *
     * @param id
     * @return
     */
    protected abstract Product createProduct(String id);

    protected abstract void registerProduct(Product product);
}
