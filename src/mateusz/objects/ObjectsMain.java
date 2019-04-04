package mateusz.objects;

public class ObjectsMain {

    public static void main(String[] args) {
        Country poland = new Country("Polska", 123123123, 38000000);

        String name = poland.getName();
        int area = poland.getArea();
        int population = poland.getPopulation();

        System.out.println("Area = " + area);

        poland.setArea(312696);

        System.out.println("Not updated area = " + area);

        System.out.println("Updated area = " + poland.getArea());

    }
}
