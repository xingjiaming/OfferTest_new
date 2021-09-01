package designPattern.buildPattern.absfactory;

import utils.Utils;

public class ProductXM2 extends absProduct {

    public ProductXM2() {
        tag = "ProductXM2";
    }

    @Override
    public void show() {
        Utils.print("ProductXM2 is show");
    }
}
