package mateusz.objects;

public class ObjectsMain {

    public static void main(String[] args) {

        User mateusz = new User("Mateusz", "klelelele");


    }

    private static void printCountriesForEach(Country[] countries) {
        for (Country c : countries) {
            System.out.println("Name: " + c.getName() + ", area:" + c.getArea() + ", population:" + c.getPopulation());
        }
    }

    private static void printCountries(Country[] countries) {
        for (int i = 0; i < 4; i++) {

            System.out.println(countries[i].getName());

        }
    }

    private static Country getBiggestCountry(Country[] countries) {
        Country memory = countries[0];

        for (Country country : countries) {
            if (country.getArea() > memory.getArea()) {
                memory = country;
            }
        }

        return memory;
    }

    private static void printCountriesThatStartWith(Country[] countries, String countryNameBeggining) {
        for (Country c : countries) {
            if (c.getName().startsWith(countryNameBeggining)) {
                System.out.println("Name: " + c.getName() + ", area:" + c.getArea() + ", population:" + c.getPopulation());
            }
        }
    }

}