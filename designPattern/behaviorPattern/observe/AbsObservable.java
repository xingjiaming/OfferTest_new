package designPattern.behaviorPattern.observe;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsObservable {
    List<IObserve> list = new ArrayList<>();

    public abstract void addObserve(IObserve observe);

    public abstract void removeObserve(IObserve observe);

    public abstract void notifyObserves(String data);
}
