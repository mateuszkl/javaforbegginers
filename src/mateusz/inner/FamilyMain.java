package mateusz.inner;

public class FamilyMain {
    public static void main(String[] args) {
        Family family = new Family();
        System.out.println(family.getFather());

        family.getFather().setName("Koles");

        System.out.println(family.getFather().getName());
    }
}
