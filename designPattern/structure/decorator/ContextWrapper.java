package designPattern.structure.decorator;

public abstract class ContextWrapper implements IContext {
    IContext context;

    public ContextWrapper(IContext context) {
        this.context = context;
    }

    @Override
    public void show() {
        context.show();
    }

    public abstract void showContextWrapper();
}
