package designPattern.buildPattern.Singleton;

public class LazySingTonSafe {
    public static Data data;

    public synchronized static Data getData() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }
}
