package designPattern.buildPattern.builder;

public class DataBuilder {
    String name;
    String title;
    String avator;

    public DataBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DataBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public DataBuilder withAvator(String avator) {
        this.avator = avator;
        return this;
    }

    public Data build() {
        return new Data(this);
    }
}
