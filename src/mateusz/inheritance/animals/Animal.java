package mateusz.inheritance.animals;

public class Animal {

    private int age;

    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSound() {
        System.out.println(" wo oo o ooo");
    }

}
