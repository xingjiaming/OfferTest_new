package designPattern.structure.staticProxy;

import utils.Utils;

public class Request implements IRequest {
    @Override
    public void request() {
        Utils.print("发起了一次真正的调用");
    }
}
