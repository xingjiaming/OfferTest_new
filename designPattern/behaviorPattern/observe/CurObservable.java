package designPattern.behaviorPattern.observe;

public class CurObservable extends AbsObservable {
    @Override
    public void addObserve(IObserve observe) {
        if (list.contains(observe)) {
            return;
        }
        list.add(observe);
    }

    @Override
    public void removeObserve(IObserve observe) {
        if (list.contains(observe)) {
            list.remove(observe);
        }
    }

    @Override
    public void notifyObserves(String data) {
        for (IObserve iObserve : list) {
            iObserve.notify(data);
        }
    }
}
