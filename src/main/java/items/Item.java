package items;

public abstract class Item {
    private String name;
    private ClassTypes classType;

    public Item(String name, ClassTypes classType) {
        this.name = name;
        this.classType = classType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassTypes getClassType() {
        return classType;
    }

    public void setClassType(ClassTypes classType) {
        this.classType = classType;
    }
}
