package learn.something.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Client Role, 使用复制实例的方法生成新实例
 */
public class Manager {

    Map<String, Comment> map = new HashMap<>();

    public void register(String name, Comment product) {
        map.put(name, product);
    }

    public Comment create(String name) {
        Comment product = map.get(name);
        return product.createClone();
    }
}
