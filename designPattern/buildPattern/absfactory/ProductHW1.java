package designPattern.buildPattern.absfactory;

import utils.Utils;

public class ProductHW1 extends absProduct {

    public ProductHW1() {
        tag = "ProductHW1";
    }

    @Override
    public void show() {
        Utils.print("ProductHW1 is show");
    }
}
