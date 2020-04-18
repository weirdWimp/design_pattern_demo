package learn.something.factory_method.idcard;

import learn.something.factory_method.framework.Factory;
import learn.something.factory_method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {

    private List<String> ids = new ArrayList<String>();

    protected Product createProduct(String id) {
        return new IdCard(id);
    }

    protected void registerProduct(Product product) {
        ids.add(((IdCard) product).getId());
    }

    public List<String> getIds() {
        return ids;
    }
}
