import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.*;

public class HW2test {

    @Test
    public void checkInstanceOfClass() {
        Car bmwX5 = new Car("BMW", "X5", 2018);
        assertThat(bmwX5).isInstanceOf(Vehicle.class);
    }

    @Test
    public void checkNumOfCarWheels() {
        Car lexus350 = new Car("Lexus", "RX350", 2020);
        assertThat(lexus350.wheels).isEqualTo(4);
    }

    @Test
    public void checkNumOfMotorcycleWheels() {
        Motorcycle minsk200 = new Motorcycle("Минск", "CX200", 2020);
        assertThat(minsk200.wheels).isEqualTo(2);
    }

    @Test
    public void checkForCarDriveSpeed() {
        Car ladaKalina = new Car("Lada", "Kalina", 2022);
        ladaKalina.testDrive();
        assertThat(ladaKalina.speed).isEqualTo(60);
    }

    @Test
    public void checkForMotorcycleDriveSpeed() {
        Motorcycle kawasakiZX6 = new Motorcycle("Kawasaki", "ZX6", 2023);
        kawasakiZX6.testDrive();
        assertThat(kawasakiZX6.speed).isEqualTo(75);
    }

    @Test
    public void checkForCarParkSpeed() {
        Car uazPatriot = new Car("Uaz", "Patriot", 2016);
        uazPatriot.testDrive();
        uazPatriot.park();
        assertThat(uazPatriot.speed).isEqualTo(0);
    }

    @Test
    public void checkForMotorcycleParkSpeed() {
        Motorcycle yamahamt06 = new Motorcycle("YAMAHA", "MT-06", 2018);
        yamahamt06.testDrive();
        yamahamt06.park();
        assertThat(yamahamt06.speed).isEqualTo(0);
    }
}
