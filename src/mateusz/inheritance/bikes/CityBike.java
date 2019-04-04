package mateusz.inheritance.bikes;

public class CityBike extends Bike {

    @Override
    public void increaseSpeed(int power) {
        velocity += power - 2;
    }

}
