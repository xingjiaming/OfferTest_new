package designPattern.behaviorPattern.chainofresponsibility;

public class Handler2 extends IHandler {

    public Handler2(IHandler iHandler) {
        setNext(iHandler);
        tag = "Handler2";
    }

    @Override
    public void handler(String input) {
        if (input.equals(tag)) {
            System.out.println(tag + "已经处理了");
        } else {
            if (getNext() == null) {
                System.out.println(tag + "无法处理");
            }
        }
    }
}
