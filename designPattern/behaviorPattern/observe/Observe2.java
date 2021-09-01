package designPattern.behaviorPattern.observe;

public class Observe2 implements IObserve {

    @Override
    public void notify(String data) {
        System.out.println(data + "IObserve2");
    }
}
