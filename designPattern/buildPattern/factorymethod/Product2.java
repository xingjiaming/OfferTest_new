package designPattern.buildPattern.factorymethod;

import utils.Utils;

public class Product2 extends absProduct {

    public Product2() {
        tag = "product2";
    }

    @Override
    public void show() {
        Utils.print("product2 is show");
    }
}
