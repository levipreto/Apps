package Misc.MotorBike;

public class MotorBike {
    // state
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
        if (this.speed - howMuch < 0)
            this.speed = 0;
    }

    void start() {
        System.out.println("Bike Started");
    }
}