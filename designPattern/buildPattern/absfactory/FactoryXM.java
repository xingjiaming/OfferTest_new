package designPattern.buildPattern.absfactory;

public class FactoryXM extends absFactory {
    @Override
    public absProduct getProduct1(String input) {
        return new ProductXM1();
    }

    @Override
    public absProduct getProduct2(String input) {
        return new ProductXM2();
    }
}
