package mateusz.inheritance.bikes;

public abstract class Bike {

    protected int velocity;

    protected String color;

    protected int price;

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void increaseSpeed(int power);

}
