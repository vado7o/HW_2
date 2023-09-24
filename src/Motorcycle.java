public class Motorcycle extends Vehicle {

    int wheels = 2;
    int speed = 0;

    public Motorcycle(String company, String model, int yearRelease) {
        super.company = company;
        super.model = model;
        super.yearRelease = yearRelease;
    }

    @Override
    public void testDrive() {
        this.speed = 75;
    }

    @Override
    public void park() {
        this.speed = 0;
    }
}
