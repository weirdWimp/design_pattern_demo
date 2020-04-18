package learn.something.factory_method;

import learn.something.factory_method.framework.Product;
import learn.something.factory_method.idcard.IdCardFactory;

public class FactoryMethodMain {

    public static void main(String[] args) {

        IdCardFactory factory = new IdCardFactory();
        Product guo = factory.create("Guo");
        Product tang = factory.create("Tang");

        guo.use();
        tang.use();
    }
}
