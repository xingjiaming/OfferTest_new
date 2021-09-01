package designPattern.buildPattern.Singleton;

public class DoubleCheckSingTonSafe {
    public volatile static Data data;

    public static Data getData() {
        if (data == null) {
            synchronized (Data.class) {
                if (data == null) {
                    data = new Data();
                }
            }
        }
        return data;
    }
}
