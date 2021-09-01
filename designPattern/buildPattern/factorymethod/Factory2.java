package designPattern.buildPattern.factorymethod;

public class Factory2 extends absFactory {
    @Override
    public absProduct getProduct(String input) {
        return new Product2();
    }
}
