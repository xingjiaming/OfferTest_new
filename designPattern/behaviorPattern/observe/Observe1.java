package designPattern.behaviorPattern.observe;

public class Observe1 implements IObserve {

    @Override
    public void notify(String data) {
        System.out.println(data + "IObserve1");
    }
}
