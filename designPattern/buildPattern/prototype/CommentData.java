package designPattern.buildPattern.prototype;

public class CommentData implements Cloneable {
    public RelationData getRelationData() {
        return relationData;
    }

    public void setRelationData(RelationData relationData) {
        this.relationData = relationData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private RelationData relationData;
    private String name;

    @Override
    public String toString() {
        return "CommentData{" +
                "relationData=" + relationData.getTitle() +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        /**
         * 实现深拷贝的一种方法:引用类型，直接新建，避免嵌套修改
         */
        ((CommentData) object).relationData = new RelationData();
        /**
         * 实现深拷贝的一种方法:引用类型，通过嵌套clone来新建，避免嵌套修改
         */
        ((CommentData) object).relationData = this.relationData.clone();
        return object;
    }
}
