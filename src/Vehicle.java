public abstract class Vehicle {
    String company;
    String model;
    int yearRelease;
    int numWheels;
    int speed;
    public abstract void testDrive();
    public abstract void park();

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
