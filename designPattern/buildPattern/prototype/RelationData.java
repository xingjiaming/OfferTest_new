package designPattern.buildPattern.prototype;

public class RelationData  implements Cloneable{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    @Override
    public RelationData clone() {
        try {
            RelationData clone = (RelationData) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
