package designPattern.structure.dynamicProxy;

import java.lang.reflect.Proxy;

public class Context {
    public static void trigger() {
        RequestProxy requestProxy = new RequestProxy(new Request());
        IRequest iRequest = (IRequest) Proxy.newProxyInstance(IRequest.class.getClassLoader(), new Class<?>[]{IRequest.class}, requestProxy);
        iRequest.request();
    }
}
