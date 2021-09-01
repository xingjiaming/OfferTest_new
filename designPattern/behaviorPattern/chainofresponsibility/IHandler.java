package designPattern.behaviorPattern.chainofresponsibility;

public abstract class IHandler {
    String tag = "";

    private IHandler next = null;

    public IHandler getNext() {
        return next;
    }

    public void setNext(IHandler next) {
        this.next = next;
    }

    public abstract void handler(String input);
}
