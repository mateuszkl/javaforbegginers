package mateusz.inheritance.bikes;

public class MountainBike extends Bike {

    @Override
    public void increaseSpeed(int power) {
        velocity += power;
    }
}
