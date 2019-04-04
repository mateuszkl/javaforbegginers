package mateusz.inheritance.family;

public class FamilyMain {

    public static void main(String[] args) {
        FamilyMember son = new Son();
        son.setName("Czarek");

        FamilyMember father = new Father();
        father.setName("Jarek");

        FamilyMember mother = new Mother();
        mother.setName("Darek");

        mother.introduce();
        son.introduce();
        father.introduce();

    }
}
