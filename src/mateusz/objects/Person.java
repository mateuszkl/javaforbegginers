package mateusz.objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Jestem " + name + ", mam " + age);
    }

    public static void main(String[] args) {
        Person michal = new Person("Michal", 25);
        Person milena = new Person("Milena", 28);

        michal.introduce();
        milena.introduce();
    }
}
