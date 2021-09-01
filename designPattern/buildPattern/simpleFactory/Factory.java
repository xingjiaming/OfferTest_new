package designPattern.buildPattern.simpleFactory;

import utils.Utils;

public class Factory {
    public static AbsProduct getProduct(String input) {
        if (input.equals("product1")) {
            return new Product1();
        } else if (input.equals("product2")) {
            return new Product2();
        } else {
            Utils.print("error input ");
            return null;
        }
    }
}
