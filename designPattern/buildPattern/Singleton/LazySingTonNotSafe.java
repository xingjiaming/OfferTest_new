package designPattern.buildPattern.Singleton;

public class LazySingTonNotSafe {
    public static Data data;

    public static Data getData() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }
}
