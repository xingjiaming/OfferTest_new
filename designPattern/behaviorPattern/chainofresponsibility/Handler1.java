package designPattern.behaviorPattern.chainofresponsibility;

public class Handler1 extends IHandler {

    public Handler1(IHandler iHandler) {
        setNext(iHandler);
        tag = "Handler1";
    }

    @Override
    public void handler(String input) {
        if (input.equals(tag)) {
            System.out.println(tag + "已经处理了");
        } else {
            getNext().handler(input);
        }
    }
}
