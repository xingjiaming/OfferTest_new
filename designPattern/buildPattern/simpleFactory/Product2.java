package designPattern.buildPattern.simpleFactory;

import utils.Utils;

public class Product2 extends AbsProduct {

    public Product2() {
        tag = "product2";
    }

    @Override
    public void show() {
        Utils.print("product2 is show");
    }
}
