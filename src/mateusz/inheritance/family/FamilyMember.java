package mateusz.inheritance.family;

public class FamilyMember {

    private String type;

    private String name;

    public FamilyMember(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public FamilyMember() {

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce() {

    }
}
