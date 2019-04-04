package mateusz.inheritance.family;

public class Son extends FamilyMember {

    @Override
    public void introduce() {
        System.out.println("Jestem synem i nazywam sie " + getName());
    }

}
