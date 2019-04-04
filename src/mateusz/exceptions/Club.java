package mateusz.exceptions;

public class Club {

    public void enter(Person person) {
        if (person.getAge() < 18) {
            throw new NotAdultException();
        }

        System.out.println("Welcome to the club " + person.getName());
    }
}
