package designPattern.structure.staticProxy;

import utils.Utils;

public class RequestProxy {
    IRequest request = new Request();

    public void request() {
        preReq();
        request.request();
        postReq();
    }

    private void postReq() {
        Utils.print("请求已经发起完成");
    }

    private void preReq() {
        Utils.print("请求发起之前");
    }
}
