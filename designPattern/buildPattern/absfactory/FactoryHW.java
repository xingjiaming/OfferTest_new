package designPattern.buildPattern.absfactory;

public class FactoryHW extends absFactory {
    @Override
    public absProduct getProduct1(String input) {
        return new ProductHW1();
    }

    @Override
    public absProduct getProduct2(String input) {
        return new ProductHW2();
    }
}
