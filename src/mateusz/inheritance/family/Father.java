package mateusz.inheritance.family;

public class Father extends FamilyMember {

    @Override
    public void introduce() {
        System.out.println("Jestem tata i nazywam sie " + getName());
    }

}
