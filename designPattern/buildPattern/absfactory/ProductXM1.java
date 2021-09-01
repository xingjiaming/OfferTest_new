package designPattern.buildPattern.absfactory;

import utils.Utils;

public class ProductXM1 extends absProduct {

    public ProductXM1() {
        tag = "ProductXM1";
    }

    @Override
    public void show() {
        Utils.print("ProductXM1 is show");
    }
}
