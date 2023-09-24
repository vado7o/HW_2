public class Car extends Vehicle {

    int wheels = 4;
    int speed = 0;

    public Car(String company, String model, int yearRelease) {
        super.company = company;
        super.model = model;
        super.yearRelease = yearRelease;
    }

    @Override
    public void testDrive() {
        this.speed = 60;
    }

    @Override
    public void park() {
        this.speed = 0;
    }

}
