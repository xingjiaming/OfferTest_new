package designPattern.buildPattern.factorymethod;

public class Factory1 extends absFactory {
    @Override
    public absProduct getProduct(String input) {
        return new Product1();
    }
}
