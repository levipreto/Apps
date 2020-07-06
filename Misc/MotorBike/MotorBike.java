package Misc.MotorBike;

public class MotorBike {

    // state
    private int speed;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started");
    }
}