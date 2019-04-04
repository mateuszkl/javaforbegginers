package mateusz.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {

        Person adult = new Person("Mateusz", "Klepacki", 27);
        Person child = new Person("Franek", "Be", 10);

        Club bodega = new Club();

        bodega.enter(adult);

        bodega.enter(child);

    }

}
