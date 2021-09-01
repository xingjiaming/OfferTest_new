package designPattern.buildPattern.simpleFactory;

import utils.Utils;

public class Product1 extends AbsProduct {

    public Product1() {
        tag = "product1";
    }

    @Override
    public void show() {
        Utils.print("product1 is show");
    }
}
