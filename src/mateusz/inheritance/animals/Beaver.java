package mateusz.inheritance.animals;

public class Beaver extends Animal {

    public Beaver() {

    }

    public Beaver(int age, String name) {
        super(age, name);
    }


    @Override
    public void getSound() {
        System.out.println("gryzie");
    }

}
