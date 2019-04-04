package mateusz.inheritance.family;

public class Mother extends FamilyMember {

    @Override
    public void introduce() {
        System.out.println("Jestem matka i nazywam sie " + getName());
    }

}
