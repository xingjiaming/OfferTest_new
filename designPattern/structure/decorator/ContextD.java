package designPattern.structure.decorator;

import utils.Utils;

public class ContextD extends ContextWrapper {

    public ContextD(IContext context) {
        super(context);
    }

    @Override
    public void showContextWrapper() {
        Utils.print("这个是我们扩展后的 showContextWrapper");
    }
}
