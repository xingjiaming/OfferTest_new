package designPattern.buildPattern.factorymethod;

import utils.Utils;

public class Product1 extends absProduct {

    public Product1() {
        tag = "product1";
    }

    @Override
    public void show() {
        Utils.print("product1 is show");
    }
}
