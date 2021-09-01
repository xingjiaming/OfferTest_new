package designPattern.buildPattern.Singleton;

public class HungerySingTonSafe {
    public static final Data DATA_INSTANCE = new Data();

    public static Data getDataInstance() {
        return DATA_INSTANCE;
    }
}
