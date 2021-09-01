package designPattern.structure.dynamicProxy;

import utils.Utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestProxy implements InvocationHandler {
    IRequest request;

    public RequestProxy(IRequest iRequest) {
        this.request = iRequest;
    }

    private void postReq() {
        Utils.print("请求已经发起完成");
    }

    private void preReq() {
        Utils.print("请求发起之前");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preReq();
        Object object = method.invoke(request, args);
        postReq();
        return object;
    }
}
