package mateusz.inheritance.bikes;

public class BikeMain {

    public static void main(String[] args) {

        CityBike cityBike = new CityBike();
        MountainBike mountainBike = new MountainBike();
        ElectricBike electricBike = new ElectricBike();

        cityBike.setVelocity(10);
        mountainBike.setVelocity(10);
        electricBike.setVelocity(10);
        electricBike.setBatteryCharge(100);

        cityBike.increaseSpeed(5);
        mountainBike.increaseSpeed(5);
        electricBike.increaseSpeed(5);

        System.out.println("Predkosc roweru miejskiego: " + cityBike.getVelocity());
        System.out.println("Predkosc roweru gorskiego: " + mountainBike.getVelocity());


        System.out.println("Predkosc roweru elektrycznego: " + electricBike.getVelocity() + ", poziom naładowania: " + electricBike.getBatteryCharge());

        electricBike.increaseSpeed(5);

        System.out.println("Predkosc roweru elektrycznego: " + electricBike.getVelocity() + ", poziom naładowania: " + electricBike.getBatteryCharge());

        electricBike.increaseSpeed(5);

        System.out.println("Predkosc roweru elektrycznego: " + electricBike.getVelocity() + ", poziom naładowania: " + electricBike.getBatteryCharge());

    }
}
