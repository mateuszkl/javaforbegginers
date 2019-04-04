package mateusz.inheritance.bikes;

public class ElectricBike extends Bike {

    private int batteryCharge;

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    public void increaseSpeed(int power) {
        batteryCharge -= 5;
        velocity += power + 15;
    }
}
