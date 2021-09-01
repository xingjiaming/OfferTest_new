package designPattern.buildPattern.absfactory;

import utils.Utils;

public class ProductHW2 extends absProduct {

    public ProductHW2() {
        tag = "ProductHW2";
    }

    @Override
    public void show() {
        Utils.print("ProductHW2 is show");
    }
}
