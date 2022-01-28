public class Screwdriver {
    private int battery;
    private int rotationSpeed;
    private int torque;
    private int amountSpeed;

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getAmountSpeed() {
        return amountSpeed;
    }

    public void setAmountSpeed(int amountSpeed) {
        this.amountSpeed = amountSpeed;
    }

    public Screwdriver(int battery, int rotationSpeed) {
        this.battery = battery;
        this.rotationSpeed = rotationSpeed;

//
    }
}
