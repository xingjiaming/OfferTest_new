package designPattern.buildPattern.builder;

public class Data {
    private String name;
    private String title;
    private String avator;

    public Data(DataBuilder dataBuilder) {
        name = dataBuilder.name;
        title = dataBuilder.title;
        avator = dataBuilder.avator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", avator='" + avator + '\'' +
                '}';
    }
}
