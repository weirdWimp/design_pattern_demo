package learn.something.factory_method.idcard;

import learn.something.factory_method.framework.Product;

public class IdCard implements Product {

    private String id;

    /**
     * 默认的修饰符的构造器，只在相同包下使用，也就是限制了其他包时，要生成 IdCard 实例，必须使用工厂类来创建
     */
    IdCard(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void use() {
        System.out.println(id + " using...");
    }
}
